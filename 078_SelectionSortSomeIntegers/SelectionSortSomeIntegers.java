import java.util.Scanner;
import java.util.Random;
public class SelectionSortSomeIntegers{
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
       //Sorting numbers
       for(int i = 0; i < number; i++) {
        //First find the smallest number
        int minIndex = i;
        for(int j = i+1; j < number; j++) {
            //keep going through the numbers
            if(num[j] < num[minIndex]) {
                //Find the next smallest number
                minIndex = j;
            }
        }

        int temp = num[i];
        //Save the current value
        num[i] = num[minIndex];     
        //Exchange with the smallest numbers
        num[minIndex] = temp;
        //Assign the value in temp to minIndex
        System.out.println(num[i]);
    }
    scan.close();
    }
}