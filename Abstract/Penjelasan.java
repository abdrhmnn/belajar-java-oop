package Abstract;

public abstract class Penjelasan {
  // yaitu class yg tidak bisa dibuat sebagai objek secara langsung hanya bisa diturunkan

  // sama seperti class biasa, jdi bisa bikin fields, method, constructor, dll

  protected String nama = "Abdu";
  protected int hasil = 0;
  final protected String alamat = "JKT";

  // abstract method, tidak bs menambahkan block code dan juga tidak bs diberikan private
  protected abstract void sayHello();
  public abstract Boolean isLogin();
}