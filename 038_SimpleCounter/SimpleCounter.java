import java.util.Scanner;
public class SimpleCounter {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Type one number here: ");
    int num = scan.nextInt();
    int i =0;
    while(i<num){
        i++;
        System.out.println(i);
    }

    }
}
