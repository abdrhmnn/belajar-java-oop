package This;

public class Penjelasan {
  // untuk mengakses fields maupun methods objek saat ini
  String nama;

  Penjelasan(String nama){
    // this ini mengacu pada field
    // ini bisa mengatasi jika nama dari field dan juga paremeter nya sama
    this.nama = nama;
  }

  void sayHello(String nama){
    System.out.println("Hello: " + nama);
  }

  void sayHello(){
    this.sayHello("Abdu");
  }
}
