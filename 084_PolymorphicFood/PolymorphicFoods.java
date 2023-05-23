public class PolymorphicFoods {
    public static void main(String[] args) {
        Food[] foods = new Food[3];
        foods[0] = new Fruit("Apple", 52, "Red", true);
        foods[1] = new Pizza("Margherita", 250, 12, "Tomato, Mozzarella, Basil");
        foods[2] = new Fruit("Orange", 62, "Orange", true);

        for (Food food : foods) {
            System.out.println("Calories in " + food.getName() + ": " + food.getCalories());
            food.eat();

            if (food instanceof Fruit) {
                Fruit fruit = (Fruit) food;
                fruit.peel();
                fruit.enjoy();
            } else if (food instanceof Pizza) {
                Pizza pizza = (Pizza) food;
                pizza.bake();
                pizza.serve();
            }

            System.out.println();
        }
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
0/1 Comments

 */