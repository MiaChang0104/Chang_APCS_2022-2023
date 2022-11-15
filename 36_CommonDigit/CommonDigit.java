import java.util.Scanner;
public class CommonDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your first number here(between 25 - 75 ):");
        //first number
        String first = scan.nextLine();
        String first1 = (String) first.subSequence(0, 1);
        System.out.println("Type your second number here(between 25 - 75 ):");
        String second = scan.nextLine();
        String second1= (String) second.substring(0, 1);
        if (first1.equals(second1))

        
    }
}
