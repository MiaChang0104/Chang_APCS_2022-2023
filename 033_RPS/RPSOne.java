import java.util.Scanner;

public class RPSOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("which one do you want to choose? Rock(Type 1), Paper(Type 2) or Scissors(Type 3)");
        int name = scan.nextInt();
        int computer = (int) (Math.random() * 3 + 1);
        // rock =1,paper=2,scissors=3
        if (name ==computer) {
            System.out.println("Same");
            // computer lose
        } else if (name == 1 && computer == 3) {
            System.out.println("you win");
        } else if (name == 2 && computer == 1) {
            System.out.println("you win");
        } else if (name == 3 && computer == 2) {
            System.out.println("you win");
            // computer win
        } else if (name == 1 && computer == 2) {
            System.out.println("You lose");
        } else if (name == 2 && computer == 3) {
            System.out.println("You lose");
        } else if (name == 3 && computer == 1) {
            System.out.println("you lose");
        } else {
            System.out.println("broken");
            scan.close();
        }
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
1/1 Comments

These comments are pretty weak. I need more going forward.

 */