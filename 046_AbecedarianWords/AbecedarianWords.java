import java.util.Scanner;

public class AbecedarianWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character :");
        String words = scan.nextLine();

        int words1 = words.length() - 1;
        for (int i = 0; i < words1; i++) {
            if (words.charAt(i) <= words.charAt(i + 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scan.close();
    }

}
//begin at 0,so words.length()-1

/*

1/1 - Compiles?
0/1 - Accurate versus the instructions?

Ultimately, it should just answer once if if is or is not abcdarian. You're
Just checking the a letter against the last letter.

1/1 - Formatting?
1/1 Comments

 */