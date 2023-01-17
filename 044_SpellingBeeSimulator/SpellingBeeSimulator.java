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

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
1/1 Comments

These comments are pretty weak. I need more going forward.

 */