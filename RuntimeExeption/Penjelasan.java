package RuntimeExeption;

public class Penjelasan extends RuntimeException{
  // ada 3 jenis error di java secara umum, yaitu :
  // checked exeption (cth nya ada di folder exeption)
  // runtime exeption
  // error

  // runtime exeption yaitu exeption yg gak harus di masukkan ke dalam try catch
  public Penjelasan(String msg){
    super(msg);
  }

  // contoh implementasi nya ada di file ExeptionClass.java
}
