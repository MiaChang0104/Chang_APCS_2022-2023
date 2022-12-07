import java.util.Scanner;

public class SpellingBeeSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your word here:");
        String word = scan.nextLine();
        System.out.println(word);
        for (int i = 0; i<word.length(); i++){
            System.out.println
            (word.substring(i,i+1)+"-");
        }
        
    }
}
