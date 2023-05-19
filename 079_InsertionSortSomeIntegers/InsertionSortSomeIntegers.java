import java.util.Scanner;
import java.util.Random;

public class InsertionSortSomeIntegers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many number do you want: ");
        int count = scan.nextInt();
        

        Random random = new Random();
        int[] randomIntegers = new int[count];
        for (int i = 0; i < count; i++) {
            randomIntegers[i] = random.nextInt(1000) + 1;
        }
        
        for (int num : randomIntegers) {
            System.out.print(num + " ");
        }
        System.out.println();
        

        insertionSort(randomIntegers);
        for (int num : randomIntegers) {
            System.out.print(num + " ");
        }
    }  
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i]; 
            int j = i - 1;
            
           
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
     
        }
    }
}