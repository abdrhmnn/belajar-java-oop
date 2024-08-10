package Interface;

import java.util.PrimitiveIterator.OfInt;

public interface Penjelasan extends OfInt {
  // sama seperti abstract class, hanya saja yg membedakan semua method didalam interface
  // akan otomatis (default) menjadi abstract, public dan constant

  // bisa inheritance lebih dari satu interface ke interface dgn keyword "extends"
  // bisa inheritance lebih dari satu interface dari child class dgn keyword "implements"

  // disini tidak boleh bikin fields selain yang CONSTANT
  final int umur = 20;
  int hasil = 10;

  public String getNama(); // wajib override di class yg implements interface ini

  // bisa juga bikin option untuk method untuk di override atau tidak dgn keyword "default"
  default Boolean isLogin(){
    return true;
  }
}
