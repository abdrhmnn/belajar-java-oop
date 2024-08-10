package InnerAndAnonymous;

import InnerAndAnonymous.Penjelasan.Company.Employee;

public class Penjelasan {
  // inner class yaitu class yg berada di dalam block class lain
  // biasa di pakai untuk kondisi beberapa class yg saling berhubungan
  // misal hubungan antara class Company dan Employee


  // Anonymous class adalah bentuk sederhana untuk pembuatan class sekaligus declare objek nya
  // kekurangannya gabisa di reuse objek nya
  public static void main(String[] args) {

    // cth buatnya kek gini
    // tpi untuk implementasi nya digunakan pada interface atau abstract class
    Employee employee = new Employee(){
      void sayHello(){
        System.out.println("Test from anonymouse class");
      }
    };
  }

  public class Company {
    String nama = "Abdu";

    public void main(String[] args) {
      // membuat object inner class
      Company company = new Company();
      Company.Employee employee = company.new Employee();
    }
    

    public class Employee {
      // didalam inner bisa mengakses fields ataupun informasi yg dimiliki oleh outer class nya
      public void main(String[] args) {
        System.out.println(Company.this.nama); // seperti ini
      }
    }
  }
}
