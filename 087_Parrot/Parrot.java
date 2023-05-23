import java.util.Scanner;

public class Parrot {
    public static void main(String[] args) {
        repeatPhrase();
    }

    public static void repeatPhrase() {
        Scanner scanner = new Scanner(System.in);
        String phrase = "";

        while (!phrase.equalsIgnoreCase("exit")) {
            System.out.print("Enter a phrase (or 'exit' to end): ");
            phrase = scanner.nextLine();
            if (!phrase.equalsIgnoreCase("exit")) {
                System.out.println("Parrot says: " + phrase);
            }
        }

        scanner.close();
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
0/1 Comments

 */