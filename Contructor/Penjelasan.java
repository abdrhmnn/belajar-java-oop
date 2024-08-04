package Contructor;

public class Penjelasan {
  // yaitu method yg akan langsung dijalankan ketika objek dibuat
  String nama;

  Penjelasan(String name){
    System.out.println("Hello, " + name);
  }

  // Overloading constructor
  Penjelasan(int umur, String alamat){
    // mempergunakan constructor yang lain dengan keyword "this"
    this("Abdu");

    System.out.println("Umur: " + umur + " lokasi: " + alamat);
  }

  public static void main(String[] args) {
    // ini udh langsung cetak informasi nya
    Penjelasan penjelasan = new Penjelasan("Abdu");
    Penjelasan penjelasan2 = new Penjelasan(20, "Jakarta");
  }
}
