package Enum.ClassEnum;

// class enum
// best practice nya data yg di dalam enum itu huruf kapital
public enum Penjelasan {
  // class yg berisikan nilai terbatas yg sudah ditentukan nilai nya

  BASIC("Abdu"),
  STANDART("Eunha"),
  PREMIUM("Sowon");

  // di dalam enum class bisa juga ditambahkan properti, method serta constructor
  private String nama;

  Penjelasan(String nama){
    this.nama = nama;
  }

  public String getNama(){
    return this.nama;
  }
}
