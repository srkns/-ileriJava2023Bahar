public class ArrayDizi {

    public ArrayDizi() {
        String[] gunler = {"Pzts", "Salı", "Çrşmb", "Prşmb", "Cuma"};
        for (String gun : gunler) {
            System.out.println(gun);
        }

        String aylar[] = new String[3];
        for (String ay : aylar) {
            System.out.println(ay);
        }
//        String aylar[];
//        aylar = new String[3];
        aylar[0] = "Ocak";
        aylar[1] = "Şubat";
        aylar[2] = "Mart";

        for (String ay : aylar) {
            System.out.println(ay);
        }

//        String[] cinsiyet, yas, sinif; // hepsi String dizisidir
        String cinsiyet[], yas, sinif; // cinsiyet dizi, yas ve sinif String

        System.out.println("----");
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < arabalar.length; i++) { // i <= arabalar.length olursa java.lang.ArrayIndexOutOfBoundsException: 4
            System.out.println(arabalar[i]);
        }


    }

    public static void main(String[] args) {
        new ArrayDizi();
    }

}
