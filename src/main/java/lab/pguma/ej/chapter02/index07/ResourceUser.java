package lab.pguma.ej.chapter02.index07;

public class ResourceUser implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("close処理がコールされました。");
  }
}