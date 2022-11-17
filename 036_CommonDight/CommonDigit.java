import java.util.Scanner;

public class CommonDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your first number here(25--75): ");
        String number1 = scan.nextLine();
        System.out.println("Type your second number here(25--75): ");
        // use string
        String number2 = scan.nextLine();
        String num1 = number1.substring(0, 1);
        String num2 = number1.substring(1, 2);
        String num3 = number2.substring(0, 1);
        String num4 = number2.substring(1, 2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        if (num1.equals(num3)) {
            System.out.println("have same number " + num1);
        } else if (num1.equals(num4)) {
            System.out.println("have same number " + num4);
        } else if (num2.equals(num3)) {
            System.out.println("have same number " + num3);
        } else if (num2.equals(num4)) {
            System.out.println("have same number " + num4);
        } else {
            System.out.println("Didn't find the same number");
        }
    }
}
