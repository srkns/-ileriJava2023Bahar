public class Main {

    public Main () {
        int x = 10;
        int y = 25;
        System.out.println("İki sayıdan büyük olanı : " + Math.max(x, y));
        System.out.println("x y'den büyük mü : " + booleanEvetHayirOlarakDon(x > y));

        System.out.println("x in değeri 10 mu ? " + booleanEvetHayirOlarakDon(x == 10));

        int myAge = 17;
        int votingAge = 18;
        System.out.println("Yaşım " + myAge + ". Oy kullanabilir miyim? " + booleanEvetHayirOlarakDon(myAge >= votingAge));

        int karekok = 50;
        System.out.println("Sayının karekökü : " + (int)Math.sqrt(karekok));

        boolean medipolEglenceliMi = false;
        System.out.println("Medipol Eglenceli Mi : " + medipolEglenceliMi);
        System.out.println("Medipol Eglenceli Mi : " + (medipolEglenceliMi ? "EVET" : "HAYIR"));
        System.out.println("Medipol Eglenceli Mi : " + booleanEvetHayirOlarakDon(medipolEglenceliMi));
    }

    /*
       Kısa Hali : (medipolEglenceliMi ? "EVET" : "HAYIR")
    */
    public String booleanEvetHayirOlarakDon(boolean evetHayir) {
        if (evetHayir) {
            return "EVET";
        } else {
            return "HAYIR";
        }
    }


    public static void main(String[] args) {
        new Main();
    }
}