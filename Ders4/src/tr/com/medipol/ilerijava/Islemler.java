package tr.com.medipol.ilerijava;

public class Islemler {

    public static int piSayisi = 3;

    public int intDegisken = 4;

    public Islemler() {
        //programinBasladiginiYaz();
        programDurumYaz("başladı");
        int toplamaSayisi = 0;
        int a = 5;
        int b = 7;
        toplam(a, b);
        int sonuc = toplam(a, b);
        toplamaSayisi++;
        System.out.println("İşlemin sonucu : " + sonuc);
        programDurumYaz(toplamaSayisi + ". toplama işlemi bitti");
        int k = 9;
        int l = 19;
        int sonuc2 = toplam(k, l);
        toplamaSayisi++;
        programDurumYaz(toplamaSayisi + ". toplama işlemi bitti");
        int x = 3;
        int y = 8;
        int toplamaSonucu = toplam(x, y);
        toplamaSayisi++;
        programDurumYaz(toplamaSayisi + ". toplama işlemi bitti");
        System.out.println("İşlemin sonucu : " + toplamaSonucu);
        //programinBittiginiYaz();
        programDurumYaz("bitti");
    }

    public int toplam(int parametreBir, int parametreIki) {
        System.out.println("Toplama metodu çalıştı. Gelen parametreler: " + parametreBir + ", " + parametreIki);
        return parametreBir + parametreIki;
    }

//    public int toplam(int parametreBir, int parametreIki) {
//        System.out.println("Toplama metodu çalıştı. Gelen parametreler: " + parametreBir + ", " + parametreIki);
//        return parametreBir + parametreIki;
//    }

    public long toplam(long parametreBir, long parametreIki) {
        System.out.println("Toplama metodu çalıştı. Gelen parametreler: " + parametreBir + ", " + parametreIki);
        return parametreBir + parametreIki;
    }

    public void programinBasladiginiYaz() {
        System.out.println("Program başladı!");
    }

    private void programinBittiginiYaz() {
        System.out.println("Program bitti!");
    }

    /*
        programinBasladiginiYaz + programinBittiginiYaz + ...
     */
    private void programDurumYaz(String durum) {
        System.out.println("Program " + durum + "!");
    }

    public static int cikarma(int param1, int param2) {
        return param1 - param2;
    }

    public static void main(String[] args) {
        Islemler benimSifinim = new Islemler();
        Islemler benimİkinciSinifim = new Islemler();

        int sonuc = cikarma(3, 4);
        System.out.println("Cikarma sonucu : " + sonuc);

    }

}