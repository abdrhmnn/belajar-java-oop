package Static;

// bisa juga menambahkan "import static" untuk menambahkan kodingan static

public class Penjelasan {
  // dgn keyword static, field, method dan class bs di akses langsung tanpa hrs bikin objek nya
  // static hnya bs akses static lainnya klo berada di class yg sama

  // static field
  public static String nama = "abdu";
  public static int PROCESSORS;

  // static method
  public static void sayHello(){
    System.out.println("Hello from static method!");
  }

  // static inner class
  public static class Company {
    int hasil = 10;
  }

  // static block (hanya dijalankan sekali ketika class ini di load)
  static {
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }

  public static void main(String[] args) {
    // cara akses nya
    System.out.println(Penjelasan.nama);
    Penjelasan.sayHello();
    Penjelasan.Company company = new Penjelasan.Company();
  }
}
