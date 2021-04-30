package lab.pguma.ej.chapter03.index08;

import java.util.Random;
import lombok.AllArgsConstructor;

/**
 * 整合性
 * 信頼できない資源に依存するequalsメソッドを書いてはいけない
 */
public class Consistency {

  public static void main(String[] args) {
    final MutableClass a = new MutableClass("0です。");
    final MutableClass b = new MutableClass("0です。");
    // 同一のインスタンスを比較しているのに実行ごとに結果が変わってしまう可能性がある。
    System.out.println(a.equals(b));
  }

  @AllArgsConstructor
  private static class MutableClass {
    private String mutableField;

    @Override
    public boolean equals(Object o) {
      if(o == null) return false;
      dangerMutateMethod();
      if(!(o instanceof MutableClass)) return false;
      return ((MutableClass)o).mutableField.equals(mutableField);
    }

    private void dangerMutateMethod() {
      final int randomValue = new Random().nextInt(2);
      if(randomValue == 0) {
        this.mutableField = "0です。";
      } else {
        this.mutableField = "0以外です。";
      }
    }
  }
}