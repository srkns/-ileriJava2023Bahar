public class Types {

    public Types() {
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);

        int mod = 19%10;
        System.out.println(mod);

        int arttir = 5;
        System.out.println("artir : " + arttir);
        arttir++;
        System.out.println("artir : " + arttir);

        int azalt = 5;
        System.out.println("artir : " + azalt);
        --azalt; // azalt--;
        System.out.println("artir : " + azalt);

        int sayi = 10;
        System.out.println("sayi = " + sayi);
        sayi += 5; // sayi = sayi + 5;
        System.out.println("sayi = " + sayi);

        int ikilikSistemdekiVeOperatoru = 10; // 1010
        int veIcinKullancagimizSayi = 7;
        System.out.println(ikilikSistemdekiVeOperatoru&veIcinKullancagimizSayi);
    }

    public static void main(String[] args) {
        new Types();
    }
}
