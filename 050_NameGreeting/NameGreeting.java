import java.util.Scanner;

public class NameGreeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name here:");
        String name = scan.nextLine();
        method();
    }
// make sure it's same
    public static void method () {

        System.out.println("Hello,");

    }
}
