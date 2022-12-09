import java.util.Scanner;

public class SpellingBeeSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your word here:");
        String word = scan.nextLine();
        System.out.println(word);
        String word1 = word+"-";
        for (int i = 0; i < word.length(); i++) {
            String str = word.substring(0, word1.length()-1);
            System.out.println(str);
        }
        
        
    }
}
