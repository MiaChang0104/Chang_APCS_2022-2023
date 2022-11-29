import java.util.Scanner;

public class PrintYourName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = "";
        String second = "";

        System.out.println("Type your first name");

        first = scan.nextLine();
        System.out.println("Type your last name");

        second = scan.nextLine();

        System.out.println(first + second);
        scan.close();
        // add close
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
-Probably should insert a space between first and last name, right?
1/1 Comments

 */