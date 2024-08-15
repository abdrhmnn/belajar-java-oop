package StackTraceElement;

public class Penjelasan {
  // untuk handler informasi ketika terjadi error dgn memanfaatkan printStackTrace()

  public static void main(String[] args) {
    Penjelasan penjelasan = new Penjelasan();

    try{
      // String[] names = { "Abdu", "Eunha" };
      // System.out.println(names[50]);

      penjelasan.testError();
    }catch(Throwable throwable){
      // StackTraceElement[] stackExeption = throwable.getStackTrace();
      throwable.printStackTrace();
    }
  }

  public void testError() throws Throwable{
    try{
      String[] names = { "Abdu", "Eunha" };
      System.out.println(names[50]);
    }catch(Throwable throwable){
      throw new Throwable(throwable);
    }
  }
}
