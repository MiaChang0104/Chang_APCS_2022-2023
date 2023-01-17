import java.util.Scanner;

public class DivisiblelnRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your first number here:");
        int number1 = scan.nextInt();
        System.out.println("Type your second number here:");
        int number2 = scan.nextInt();
        System.out.println("Type your third number here:");
        int number3 = scan.nextInt();
        for (int i = number1; i <= number2; i++) {
            if (i % number3 == 0) {
                System.out.println(i);

            } else {
                System.out.println("");
            } // i % number3
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