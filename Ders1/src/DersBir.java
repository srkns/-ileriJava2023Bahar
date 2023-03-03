
/*
        1. Ders içerisinde yazdığımız ilk Java sınıfımız
        Tek yaptığı iş argümanları yazdırmak
 */
public class DersBir {

    // main metodu - 2 argüman gönderdik 3. istediğimizde hata aldık.
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya!");
        System.out.println("Dizinin uzunluğu: " + args.length);
        System.out.println("Dizinin 1. elemanı: " + args[0]);
        System.out.println("Dizinin 2. elemanı: " + args[1]); // bu satirda 2. argümanı yazdırıyoruz
//        System.out.println("Dizinin 3. elemanı: " + args[2]);
        System.out.print("Yazdırma İşlemi ");
        System.out.print("Buradan devam edecek");
        System.out.println();
//        System.out.println(buraya ne yazmalıyım); // hata verecektir metinler çift tırnaklar içerisinde verilecek
        System.out.println(5);
        System.out.println(2 + 5);
    }

}
