public class FactorialRecursion {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 10;
        int number3 = 88;

        System.out.println("Factorial of " + number1 + ": " + calculateFactorial(number1));
        System.out.println("Factorial of " + number2 + ": " + calculateFactorial(number2));
        System.out.println("Factorial of " + number3 + ": " + calculateFactorial(number3));
    }

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
0/1 Comments

 */