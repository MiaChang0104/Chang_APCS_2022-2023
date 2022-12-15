import java.util.Scanner;

public class SeventeenMoreOrLess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your the first number here: ");
        int first = scan.nextInt();
        System.out.println("Type your second number here: ");
        int second = scan.nextInt();
        System.out.println("Type your third number here: ");
        int third = scan.nextInt();
        // +first

        if (first - second == 17 || first + 17 == second || first - third == 17 || first + 17 == second) {
            System.out.println("Difference of 17");
        } else if (second - first == 17 || second + 17 == first || second - third == 17 || second + 17 == third) {
            System.out.println("Difference of 17");
        } else if (third - first == 17 || third + 17 == first || third - first == 17 || third + 17 == second) {
            System.out.println("Difference of 17");
        } else {
            System.out.println("No");
        }
        scan.close();
    }

}

/*
 * 
 * 1/1 - Compiles?
 * 1/1 - Accurate versus the instructions?
 * 1/1 - Formatting?
 * 1/1 Comments
 * 
 * These comments are pretty weak. I need more going forward.
 * 
 */