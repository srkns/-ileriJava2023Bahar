package tr.edu.medipol.ilerijava.ders5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        System.out.println("Merhaba, Okulunuzun adı ne?");

        Scanner tarayici = new Scanner(System.in);
        String okulAdi = tarayici.nextLine();
        System.out.println("Okulunuz : " + okulAdi);

        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);

        int i = 5;
        Integer sayi = new Integer(5);
        Integer sayi2 = new Integer("15");

        if (i == sayi) {
            System.out.println("Sayılar eşit");
        }

    }

}