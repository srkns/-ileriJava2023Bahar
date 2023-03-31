package tr.com.medipol.ilerijava;

class Araba extends Arac {
    private String modelAdi = "Mustang";    // Car attribute

    public static void main(String[] args) {

        // Create a arabam object
        Araba arabam = new Araba();

        // Call the honk() method (from the Vehicle class) on the arabam object
        arabam.kornaYap();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(arabam.marka + " " + arabam.modelAdi);
    }
}
