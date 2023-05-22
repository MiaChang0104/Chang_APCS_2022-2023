public class Fruit extends Food {
    private boolean isSweet;

    public Fruit(String name, int calories, String color, boolean isSweet) {
        super(name, calories);
        this.isSweet = isSweet;
    }

    public void peel() {
        System.out.println("Peeling the " + getName() + ".");
    }

    public void enjoy() {
        if (isSweet) {
            System.out.println("Enjoying the sweet " + getName() + ".");
        } else {
            System.out.println("Enjoying the " + getName() + ".");
        }
    }
}