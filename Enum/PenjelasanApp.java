package Enum;

import Enum.ClassEnum.Penjelasan;

public class PenjelasanApp {
  public static void main(String[] args) {
    // cara akses nya sama seperti akses static data
    System.out.println(Penjelasan.PREMIUM.getNama());
    System.out.println(Penjelasan.BASIC.getNama());
  }
}
