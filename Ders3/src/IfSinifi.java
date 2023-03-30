public class IfSinifi {

    public IfSinifi() {
        int x = 20;
        int y = 18;

        if (x > y)
            System.out.println("x y'den büyük");

        System.out.println("Evet çok haklıymışım");

        if (x > y) {
            System.out.println("x y'den büyük");
            System.out.println("Evet çok haklıymışım");
        }

        int saat = 20;
        if (saat < 6) {
            System.out.println("İyi geceler. Saat şu anda : " + saat);
        } else if (saat < 12) {
            System.out.println("Günaydın. Saat şu anda : " + saat);
        } else if (saat < 18) {
            System.out.println("İyi günler. Saat şu anda : " + saat);
        } else {
            System.out.println("İyi akşamlar. Saat şu anda : " + saat);
        }

        int yasim = 18;
        int oyKullanmaYasi = 18;
        String oyKullanmaDurumu = (yasim >= oyKullanmaYasi) ? "EVET" : "HAYIR";
        System.out.println("Yaşım " + yasim + ". Oy kullanabilir miyim? " + oyKullanmaDurumu);

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("----");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        new IfSinifi();
    }

}
