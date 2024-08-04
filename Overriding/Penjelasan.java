package Overriding;

public class Penjelasan {
  // mendeklarasikan method ulang di child class, yg sudah ada di parent class
  // nama method, return value dan juga parameter itu harus sama dengan yang dimiliki oleh parent
  // yang bisa beda hanya isi body block kode nya

  final String nama = "Abdu";

  void sayHello(){
    System.out.println("Hellow");
  }
}

class Teman extends Penjelasan{
  // untuk mengakses class parent secara langsung di dalam child class bs menggunakan keyword "super"

  @Override
  void sayHello() {
    System.out.println("Hello from Teman, " + super.nama);
  }
}
