public class WhileDongusu {

    public WhileDongusu() {
        int i = 0;
        while (i < 5) {
            System.out.println("While : " + i);
            i++;
        }
        System.out.println("While Döngüsü bitti. Diğer işlere devam");

        do {
            System.out.println("DoWhile: " + i);
            i++;
        } while (i < 10);
        System.out.println("DoWhile Döngüsü bitti. Diğer işlere devam");

//        int j = 0; // sonsuz döngü durumu
//        while (j < 5) {
//            System.out.println("While(2) : " + j);
//        }
    }

    public static void main(String[] args) {
        new WhileDongusu();
    }
}
