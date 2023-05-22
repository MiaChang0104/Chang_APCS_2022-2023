public class Pizza extends Food {
    private String toppings;

    public Pizza(String name, int calories, int diameter, String toppings) {
        super(name, calories);
        this.toppings = toppings;
    }

    public void bake() {
        System.out.println("Baking the " + getName() + ".");
    }

    public void serve() {
        System.out.println("Serving the " + getName() + " with " + toppings + ".");
    }
}