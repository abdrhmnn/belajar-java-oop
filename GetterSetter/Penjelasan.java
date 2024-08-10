package GetterSetter;

public class Penjelasan {
  // encapsulation yaitu menjaga data di dalam objek untuk tidak bisa di akses dari luar
  // seperti edit field nya, akses, dll.

  // get -> mengambil data
  // set -> mengubah data

  private boolean isLogin;
  private String nama;

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public boolean isLogin() {
    return isLogin;
  }

  public void setLogin(boolean isLogin) {
    this.isLogin = isLogin;
  }
}
