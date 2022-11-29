import java.util.Scanner;

public class UnethicalRPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("which one do you want to choose? Rock(Type 4), Paper(Type 5) or Scissors(Type 6)");
        int name = scan.nextInt();
        int computer = (int) (Math.random() * 3 + 1);
        // rock =1,paper=2,scissors=3
        if (name >= computer && name<=6 && name>=4) {
            System.out.println("Computer win");
        } else{
            System.out.println("Wrong number");
        } scan.close();
    }
}


/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
1/1 Comments

These comments are pretty weak. I need more going forward.

 */