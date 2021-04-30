package lab.pguma.ej.chapter03.index08;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

/**
 * 対称性
 * nullでないinstance X, Y, Zについて
 * X.equals(Y)が True/Falseを返し
 * Y.equals(Z)が True/Falseを返す場合
 * X.equals(Z)は True/Falseを返さなければならない。
 *
 * 対処法：コンポジション
 */
public class Transitivity {

  public static void main(String[] args) {
    ColorPoint cp1 = new ColorPoint(1, 2, Color.BLUE);
    Point p2 = new Point(1, 2);
    ColorPoint cp3 = new ColorPoint(1, 2, Color.RED);

    System.out.println(cp1.equals(p2)); // 色を無視した比較
    System.out.println(p2.equals(cp3)); // 色を無視した比較
    System.out.println(cp1.equals(cp3)); // 色を加味した比較
  }

  @AllArgsConstructor
  @EqualsAndHashCode(of = {"x", "y"})
  private static class Point {
    private final int x;
    private final int y;
  }

  private static class ColorPoint extends Point {
    private Color color;

    ColorPoint(int x, int y, Color c) {
      super(x, y);
      this.color = c;
    }

    @Override
    public boolean equals(Object o) {
      if(o == null) return false;
      // 対称性を守るために推移性を犠牲にしてしまっている
      if(!(o instanceof ColorPoint)) {
        return o.equals(this);
      }
      return super.equals(o) && ((ColorPoint)o).color == color;
    }

  }

  private enum Color {
    RED,BLUE
  }
}