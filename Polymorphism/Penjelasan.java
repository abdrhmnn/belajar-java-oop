package Polymorphism;

public class Penjelasan {
  // erat hubungannya dengan inheritance
  // yaitu kemampuan sebuah objek yang dapat berubah bentuk menjadi bentuk lain

  String nama;
  int umur;

  Penjelasan(String nama){
    this.nama = nama;
  }

  void sayHello(){
    System.out.println("Hello " + nama + " from Penjelasan!");
  }

  static void polymorphismSayHello(Penjelasan penjelasan){
    System.out.println("Hello " + penjelasan.nama);
  }

  public static void main(String[] args) {
    Penjelasan penjelasan = new Penjelasan("Abdu");
    penjelasan.sayHello();

    // ini yg namanya polymorphism
    // walaupun objek penjelasan ini di assign dari class Penjelasan tapi kita bisa ubah langsung objek nya
    // ke objek turunan dari objek awal, dan otomatis mengakses fields serta methods dari objek yang baru
    // di assign
    penjelasan = new Teman("Eunha");
    penjelasan.sayHello();

    // bisa juga melakukan polymorphism didalam methods
    polymorphismSayHello(new Penjelasan("Sowon"));
    polymorphismSayHello(new Teman("Yerin"));
  }
}

class Teman extends Penjelasan{
  Teman(String nama) {
    super(nama);
  }

  @Override
  void sayHello() {
    System.out.println("Hello from Teman");
  }
}
