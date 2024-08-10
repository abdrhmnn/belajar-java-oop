package Abstract.Abdu;

import Abstract.Penjelasan;

public class TestAbdu extends Penjelasan {
  public static void main(String[] args) {
    TestAbdu testAbdu = new TestAbdu();
    System.out.println(testAbdu.alamat);
  }

  @Override
  protected void sayHello() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sayHello'");
  }

  @Override
  public Boolean isLogin() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isLogin'");
  }
}
