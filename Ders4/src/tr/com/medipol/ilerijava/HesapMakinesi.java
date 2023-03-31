package tr.com.medipol.ilerijava;

public class HesapMakinesi {

    public static void main(String[] args) {
        Integer integer = new Integer(4);

        Islemler islemler = new Islemler();
        Islemler islemler2 = new Islemler();
        Islemler islemler3 = new Islemler();
        System.out.println("Topla : " + islemler.toplam(2, 6));
        System.out.println("Topla : " + (new Islemler()).toplam(2, 6));
        //System.out.println("Cikarma : " + Islemler.toplam(2, 6));//derlenmiyor

        System.out.println("Islemler in icindi Pi(int): " + Islemler.piSayisi);// piSayisi => Sınıf degiskeni

        //Math math = new Math();math.max(); // olusturmaz. tüm metodlar static
        System.out.println("Cikarma : " + Islemler.cikarma(4, 3));
        System.out.println("Büyük olan : " + Math.max(4, 9));

    }

}
