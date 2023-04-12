public class Shirt {
    String color;
    String brand;
    boolean isClean = true;
    boolean isFold = false;

    // base model
    public Shirt() {
        color = "red";
        brand = "zara";

    }

    public Shirt(String cColor, String cBrand) {
        color = cColor;
        brand = cBrand;

    }
}