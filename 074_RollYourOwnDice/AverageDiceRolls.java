import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageDiceRolls {
    public static void main(String[] args) {
        List<Integer> diceRolls = new ArrayList<>();
        Dice dice = new Dice(6);
        Scanner scanner = new Scanner(System.in);

        String choice;
        do {
            int roll = dice.roll();
            diceRolls.add(roll);
            System.out.println("Latest dice roll: " + roll);
            System.out.println("Average of all dice rolls: " + calculateAverage(diceRolls));

            System.out.print("Add another dice roll? (y/n): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Final average of all dice rolls: " + calculateAverage(diceRolls));
    }

    public static double calculateAverage(List<Integer> diceRolls) {
        int sum = 0;
        for (int roll : diceRolls) {
            sum += roll;
        }
        return (double) sum / diceRolls.size();
    }
}