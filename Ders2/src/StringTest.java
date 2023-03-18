public class StringTest {

    public StringTest() {
        String soyad = "Karides Avcısı";
        System.out.println(soyad.length());
        System.out.println(soyad.toUpperCase());
        System.out.println(soyad.toLowerCase());

        System.out.println("vc indisi : " + soyad.indexOf("vc"));

        String tersSlas = "\"The character \\ is called backslash.\"";
        System.out.println(tersSlas);

    }

    public static void main(String[] args) {
        new StringTest();
    }

}
