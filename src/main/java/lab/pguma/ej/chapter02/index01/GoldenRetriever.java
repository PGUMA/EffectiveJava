package lab.pguma.ej.chapter02.index01;

import lombok.NonNull;

class GoldenRetriever extends Dog {

  protected GoldenRetriever(@NonNull final Sex sex) {
    super(sex);
  }

  @Override
  public void cry() {
    System.out.println("ワンワン");
  }
}