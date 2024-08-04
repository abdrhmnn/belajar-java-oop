package Field;

public class Penjelasan {
  // field yaitu data yang di deklarasikan di dalam class untuk nanti bs dimiliki oleh objek
  String nama;
  int umur = 20;
  final boolean isLogin = true;

  public static void main(String[] args) {
    Penjelasan penjelasan = new Penjelasan();

    // manipulasi field
    penjelasan.umur = 18;

    System.out.println(penjelasan.nama);
    System.out.println(penjelasan.umur);
    System.out.println(penjelasan.isLogin);
  }
}
