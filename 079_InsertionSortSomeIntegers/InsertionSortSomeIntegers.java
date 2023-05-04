import java.util.Scanner;
import java.util.Random;

public class InsertionSortSomeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many random integers do you need ?");
        int number = scan.nextInt();
        Random random = new Random();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = random.nextInt(1000);
            System.out.print(arr[i]+" ");
        }
    public static int[] insertionSorter(int[] arr) {
            for(int i = 1; i < arr.length; i++) {
                int temp = arr[i];
                int possibleIndex = i;
    
                while(possibleIndex > 0 && temp < arr[possibleIndex - 1]){
                    arr[possibleIndex] = arr[possibleIndex - 1];
                    possibleIndex--;
                }
    
                arr[possibleIndex] = temp;
            }
    
            return arr;   
        } 
       
    
}
