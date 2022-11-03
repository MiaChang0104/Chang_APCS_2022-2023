import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your number here:");
        int number = scan.nextInt();
        if ( number%2 == 0) {
            System.out.println("this number is even");
        } else {
            System.out.println("This number is odd");
        }
    }//number % 2 ==0
}
