package Inheritance;

public class Penjelasan {
  // kemampuan untuk menurunkan class ke class lain
  // class Parent bs punya lebih dari satu class Child
  // kalo class Child hanya bisa punya satu class Parent

  // saat class Parent di turunkan maka akan otomatis mewariskan seluruh fields dan juga methods yg dimiliki

  String nama;

  void sayHello(){
    System.out.println("Hello");
  }

  public static void main(String[] args) {
    Penjelasan penjelasan = new Penjelasan();
    penjelasan.nama = "Eunha";
    penjelasan.sayHello();

    Teman teman = new Teman();
    teman.sayHello(); // inheritance seluruh fields dan methods
  }
}

class Teman extends Penjelasan {
  
}