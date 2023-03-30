public class ForDongusu {

    public ForDongusu() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // Dış Döngü
        for (int i = 1; i <= 2; i++) {
            System.out.println("DIŞ - i:" + i); // Executes 2 times

            // İç Döngü
            for (int j = 1; j <= 3 && i < 3; j++) {
                System.out.println(" İÇ - j:" + j); // Executes 6 times (2 * 3)
            }
        }

    }

    public static void main(String[] args) {
        new ForDongusu();
    }

}
