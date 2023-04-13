import java.util.Scanner;
import java.util.Random;

public class InsertionSortSomeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many random integers do you need ?");
        int number = scan.nextInt();
        Random random = new Random();
        int[] num = new int[number];
        for (int i = 0; i < number; i++) {
            num[i] = random.nextInt(1000);
            System.out.println(num[i]);
        }
        for (int i = 0; i < number; i++) {
        }
    }
    public static int[] () {
        
    }
}
