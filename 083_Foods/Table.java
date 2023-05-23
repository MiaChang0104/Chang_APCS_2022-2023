import java.util.List;

public class Table {
    public static void main(String[] args) {
        fruit apple = new fruit("Apple", 52, "Red", true);
        pizza margherita = new pizza("Margherita", 250, 12, "Tomato, Mozzarella, Basil");
        
        System.out.println("Calories in an " + apple.getName() + ": " + apple.getCalories());
        apple.eat();
        apple.peel();
        apple.enjoy();
        
        System.out.println("\nCalories in a " + margherita.getName() + ": " + margherita.getCalories());
        margherita.eat();
        margherita.bake();
        margherita.serve();
    }

    public List<Card> getDealerHand() {
        return null;
    }

    public List<Card> getPlayerHand() {
        return null;
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
0/1 Comments

 */