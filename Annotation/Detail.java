package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Detail {
  // untuk menambahkan metadata ke kode program java yg dibuat 
  // hrs pakai @interface jika ingin buat annotation

  // ada beberapa atribut annotation, seperti :
  // @target, untuk memberitahu annotation ini bisa dipakai dimana
  // @retention, untuk memberitahu informasi annotaion nya ada gk di kode hasil kompilasi file java nya

  // contoh penambahan property
  String nama(); // wajib ditambahkan jika tdk berikan nilai default

  int[] angka() default {};

  // ada juga annotation bawaan dri java, seperti Override, Deprecated, dll
}
