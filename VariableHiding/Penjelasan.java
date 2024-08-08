package VariableHiding;

public class Penjelasan {
  // yaitu pembuatan field di parent dan child dengan nama yang sama
  String name;

  void sayHello(){
    System.out.println("Hello from parent!");
  }

  public static void main(String[] args) {
    Teman teman = new Teman();
    teman.name = "abdu";
    teman.sayHello();

    // ketika kita melakukan cast objek yang mempunyai inheritance
    // dan didalam ada method yang override maka method trsbt akan otomatis akses milik child nya
    Penjelasan penjelasan = (Penjelasan) teman;
    penjelasan.sayHello(); // sayHello milik class Teman
  }
}

class Teman extends Penjelasan {
  String name;

  @Override
  void sayHello() {
    System.out.println("Hello from child!");
  }
}