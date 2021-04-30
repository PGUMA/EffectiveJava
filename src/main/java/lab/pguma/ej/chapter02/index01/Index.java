package lab.pguma.ej.chapter02.index01;

import lab.pguma.ej.chapter02.index01.Dog.DogBreed;

public class Index {

  /**
   * コンストラクタの変わりにstaticなFactoryメソッドの使用を検討
   * <メリット>
   *   1. 名前が付けられることでどんな状態のインスタンスが返るのかを伝えやすくなる
   *   2. イミュータブルな場合に不要なインスタンス生成をせずに、利用済みのインスタンスを使いまわせる
   *   3. 任意のサブクラスを返却できる（サブクラス＝実装は非publicにできる）
   *      ＝＞利用側にはインターフェースのみを意識させることで疎結合になる
   * </メリット>
   * <デメリット>
   *   1. 非publicとなったサブクラスのサブクラスを作れない
   *      ＝＞深い継承階層を避ける・コンポジションを推奨という観点から問題はない
   *   2. 他の通常のstaticメソッドの中に埋もれる
   * </デメリット>
   * <補足：よく使われる生成メソッド名>
   *    valueOf
   *    of
   *    getInstance・・・毎回インスタンスを生成するとは限らない
   *    newInstance・・・毎回新しいインスタンスを生成する
   *    getType・・・Instanceと違って生成対象クラスと生成を請け負うクラスが別の場合に使う
   *    newType・・・Instanceと違って生成対象クラスと生成を請け負うクラスが別の場合に使う
   * </補足>
   */
  public static void main(String[] args) {
    Dog no1 = Dog.getInstanceOf(DogBreed.GoldenRetriever, Sex.maleType);
    no1.cry();
    Dog no2 = Dog.getInstanceOf(DogBreed.Poodle, Sex.femaleType);
    no2.cry();
  }
}