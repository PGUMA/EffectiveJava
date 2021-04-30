package lab.pguma.ej.chapter02.index01;

import lombok.NonNull;

class Poodle extends Dog {
  protected Poodle(@NonNull final Sex sex) {
    super(sex);
  }

  @Override
  public void cry() {
    System.out.println("キャンキャン");
  }
}