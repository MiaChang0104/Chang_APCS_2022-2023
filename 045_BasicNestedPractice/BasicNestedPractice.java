import java.util.Scanner;
public class BasicNestedPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your number here:");
        int number = scan.nextInt();
        for(int row = 0; row < number; row++){
            if(number > 20){
                System.out.println("Can't print");
            } else{
                System.out.print(row);
            }
            
        }   
    }
}
