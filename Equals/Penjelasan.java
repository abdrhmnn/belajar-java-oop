package Equals;

public class Penjelasan {
  // untuk melakukan pengecekan tipe data bukan primitif
  public static void main(String[] args) {
    String nama = "Abdu";
    nama += " Eunha";

    String nama2 = "Abdu Eunha";

    System.out.println(nama == nama2); // false
    System.out.println(nama.equals(nama2)); // true
  }
  
  // bisa jg override method equals dan bikin kondisi sendiri untuk pengecekkannya
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
  }
}
