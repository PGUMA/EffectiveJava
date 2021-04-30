package lab.pguma.ej.chapter03.index08;

public class Reflexivity {

  /**
   * 反射性
   * nullでない自分自身のinstanceとの比較ではtrueを返さなければならない
   */
  @Override
  public boolean equals(Object o) {
    if(o == null) return false;
    return o == this;
  }
}