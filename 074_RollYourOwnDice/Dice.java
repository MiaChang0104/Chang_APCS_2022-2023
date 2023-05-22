import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Dice {
    private final int sides;
    private int currentValue;

    public Dice(int sides) {
        this.sides = sides;
        this.currentValue = 0;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int roll() {
        Random random = new Random();
        currentValue = random.nextInt(sides) + 1;
        return currentValue;
    }
}