public class DersBirDegiskenler {

    public DersBirDegiskenler() {
        int sayi1 = 5;
        int sayi2 = 7;
        int toplam = sayi1 + sayi2;
        System.out.println("İlk Toplam: " + toplam);
        int sayi3 = 9;
        toplam = toplam + sayi3;
        System.out.println("İkinci Toplam: " + toplam);
        final int PI = 3;
        System.out.println("PI: " + PI);
//        PI = 5; // final degiskenlere sadece ilk değer verilebilir daha sonra bir deger atılamaz!

    }

    public static void main(String[] args) {
        new DersBirDegiskenler();
    }

}
