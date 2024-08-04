package SuperConstructor;

public class Penjelasan {
  // untuk mengakses parent constructor, hrs dipanggil didalam child contructor
  
  // Penjelasan(){} // ini dinamakan default constructor

  Penjelasan(String nama){}

  String nama = "Abdu";

  void sayHello(){
    System.out.println("Hellow");
  }
}

class Teman extends Penjelasan{

  // kalo parent constructor itu tidak memiliki parameter maka child class tidak wajib membuat constructor
  // berbeda jika parent punya constructor yg ada parameter maka child class wajib bikin constructor
  Teman(String nama) {
    super(nama);
  }
}
