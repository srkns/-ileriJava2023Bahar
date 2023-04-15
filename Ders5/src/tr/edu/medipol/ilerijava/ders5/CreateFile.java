package tr.edu.medipol.ilerijava.ders5;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File dosya = new File("yeniDosya.txt");
      if (dosya.createNewFile()) {
        System.out.println("Dosya olustu: " + dosya.getName());
        System.out.println("Dosyanın adresi : " + dosya.getAbsolutePath());
      } else {
        System.out.println("Dosya olusturulamadı!");
      }
    } catch (IOException e) {
      System.out.println("Bir hata olustu!");
      e.printStackTrace();
    }
  }
}
