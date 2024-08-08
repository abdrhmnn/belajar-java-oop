package TypeCheckdanCasts;

public class Penjelasan{
  // untuk melakukan konversi tipe data bukan primitif, namun cara baikknya check terlebih dahulu
  // dgn keyword "instanceof"

  static void sayHello(Penjelasan penjelasan){

    // pengecekkan ini sebenarnya gak wajib dilakukan
    // cuman untuk memastikan saja
    if(penjelasan instanceof Teman){
      Teman teman = (Teman) penjelasan; // konversi bukan primitif
    }
  }

}

class Teman extends Penjelasan{

}