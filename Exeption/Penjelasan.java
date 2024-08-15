package Exeption;

import javax.xml.bind.ValidationException;

import Exeption.ExeptionClass.ExeptionClass;

public class Penjelasan {
  // setiap exeption itu pasti turunan dari class Throwable

  public static void main(String[] args) {
    ExeptionClass exeptionClass = new ExeptionClass(null);
    
    // setiap function yg ada exeption itu hrs di handle didalam try catch
    try{
      ExeptionClass.validate(exeptionClass);
    }catch(ValidationException | NullPointerException v){ // handle dua atau lebih exeption di catch
      System.out.println(v.getMessage());
    }finally{ // block ini akan selalu dijalankan walapun kondisi nya terjadi exeption atau tidak
      System.out.println();
    }
  }
}
