package Method;

public class Penjelasan {
  // sama seperti field yaitu di deklarasi dlm class utk bs digunakan oleh objek nantinya

  String nama = "Abdu";

  void sayHello(){
    System.out.println("Hello, " + nama);
  }

  public static void main(String[] args) {
    Penjelasan penjelasan = new Penjelasan();
    penjelasan.nama = "Eunha";

    penjelasan.sayHello();
  }
}
