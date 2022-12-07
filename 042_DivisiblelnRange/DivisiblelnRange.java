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
            }
        }
    }
}
