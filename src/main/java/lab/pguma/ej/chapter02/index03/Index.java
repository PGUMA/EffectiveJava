package lab.pguma.ej.chapter02.index03;

import lombok.AllArgsConstructor;

/**
 * Singletonなオブジェクトを利用したい場合は
 * 単一要素のEnumで定義する方法がある。
 */
public class Index {

  public static void main(String[] args) {
    Singleton s = Singleton.INSTANCE;
    s.whoAreYou();
  }

  @AllArgsConstructor
  enum Singleton {
    INSTANCE("name")
    ;

    private final String name;

    public void whoAreYou() {
      System.out.println(this.name);
    }
  }
}