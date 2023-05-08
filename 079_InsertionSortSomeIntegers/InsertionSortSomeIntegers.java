import java.util.Scanner;
import java.util.Random;
public class InsertionSortSomeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many random integers do you need ?");
        int number = scan.nextInt();
        Random random = new Random();
        int[] num = new int[number];
        for (int i = 0; i < number; i++){
            num[i] = random.nextInt(1000);
            
            System.out.println(num[i]);
        }
        
    }

    public static int[] insertionSorter(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];
            int possibleIndex = i;

            while (possibleIndex > 0 && temp < num[possibleIndex - 1]) {
                num[possibleIndex] = num[possibleIndex - 1];
                possibleIndex--;
            }
            num[possibleIndex] = temp;
        }
        System.out.println(num);

        return num;
    }
}