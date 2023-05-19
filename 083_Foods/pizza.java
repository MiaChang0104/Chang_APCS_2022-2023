public class pizza extends Food {
    private String toppings;
    
    public pizza(String name, int calories, int diameter, String toppings) {
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