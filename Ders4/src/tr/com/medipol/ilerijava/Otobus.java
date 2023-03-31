package tr.com.medipol.ilerijava;

class Otobus extends Arac {
    private String modelAdi = "O3003";    // Car attribute

    public static void main(String[] args) {

        // Create a arabam object
        Otobus arabam = new Otobus();

        // Call the honk() method (from the Vehicle class) on the arabam object
        arabam.kornaYap();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(arabam.marka + " " + arabam.modelAdi);
    }

    public void kornaYap() {                    // Vehicle method
        System.out.println("Dood!, dood!");
    }

}
