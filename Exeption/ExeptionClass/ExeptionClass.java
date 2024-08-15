package Exeption.ExeptionClass;

import javax.xml.bind.ValidationException;

import RuntimeExeption.Penjelasan;

public class ExeptionClass {
  protected String nama;

  public ExeptionClass(String nama){
    this.nama = nama;
  }

  public static void validate(ExeptionClass exeptionClass) throws ValidationException, NullPointerException{
    if(exeptionClass.nama == null){
      throw new NullPointerException("Nama masih null");
    }else if(exeptionClass.nama.isEmpty()){
      throw new ValidationException("Nama kosong!");
    }
  }

  public static void validateRuntime(ExeptionClass exeptionClass){
    if(exeptionClass.nama == null){
      throw new Penjelasan("Nama masih null");
    }else if(exeptionClass.nama.isEmpty()){
      throw new Penjelasan("Nama kosong!");
    }
  }
}
