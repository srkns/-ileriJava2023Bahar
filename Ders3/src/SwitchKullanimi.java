public class SwitchKullanimi {

    public SwitchKullanimi() {
        int gun = 9;
        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gün numararasını kontrol edin!");
        }
    }

    public static void main(String[] args) {
        new SwitchKullanimi();
    }

}
