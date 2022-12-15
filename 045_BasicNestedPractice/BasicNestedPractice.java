import java.util.Scanner;

public class BasicNestedPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your number here:");
        String number = scan.nextLine();
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {

                if (number.length() <= 20) {
                    System.out.print(i + "-" + j + "\t");
                } else {
                    System.out.println("Can't be bigger than 20");
                    break;
                }
            }
        }
    }
}
