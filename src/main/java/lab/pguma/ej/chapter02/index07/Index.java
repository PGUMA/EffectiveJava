package lab.pguma.ej.chapter02.index07;

/**
 * ファイナライザの実装は避けましょう
 * 代わりにリソース解放のための処理を追加して明示的にコールする形が望ましい
 * AutoCloseableインターフェースを実装するのが望ましい
 */
public class Index {

  public static void main(String[] args) {
    try (ResourceUser ru = new ResourceUser()) {
      // 何か処理
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}