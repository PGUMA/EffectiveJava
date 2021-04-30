package lab.pguma.ej.chapter03.index08;

import lombok.AllArgsConstructor;

/**
 * 対称性
 * nullでないinstance X, Yについて
 * X.equals(Y)が 返す結果と Y.equals(X)が返す結果は等しくなければならない
 */
public class Symmetry {

  public static void main(String[] args) {
    final Money oneThousand_A = new Money(1000);
    final Money oneThousand_B = new Money(1000);

    System.out.println(oneThousand_A.equals(oneThousand_B));

    // 対称性が破られている
    System.out.println(oneThousand_A.equals(1000)); // true
    System.out.println(Integer.valueOf(1000).equals(oneThousand_A)); // false

  }

  @AllArgsConstructor
  private static class Money {
    private final int amount;

    @Override
    public boolean equals(Object o) {
      if(o == null) return false;
      if(o instanceof Money) {
        return ((Money) o).amount == amount;
      }
      // Integerとも無理矢理比較可能としようとしてしまっている
      if(o instanceof Integer) {
        return (Integer)o == amount;
      }
      return false;
    }
  }

}