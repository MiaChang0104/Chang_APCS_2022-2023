import java.util.Scanner;

public class SpellingBeeSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your word here:");
        String word = scan.nextLine();
        System.out.println(word);
        for (int i = 0; i < word.length(); i++) {
            /*
             * if this is the last word print word
             * else print word with"-"
             */

            if (i == word.length() - 1) {
                System.out.print(word.substring(i, i + 1));
            } else {
                System.out.print(word.substring(i, i + 1) + "-");
            }

        } scan.close();

    }
}
