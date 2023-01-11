import java.util.Scanner;

public class DoubloonWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your words here:");
        String words = scan.nextLine();
        int words1 = words.length() - 1;
        for (int i = 0; i <= words1; i++) {
            if (words.charAt(i) == words.charAt(i + 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            scan.close();
        }
    }
}
