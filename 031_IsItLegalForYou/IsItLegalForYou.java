import java.util.Scanner;
public class IsItLegalForYou {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(" Type your age to see what you can do: enroll in Medicare, Run for President, rent a car, buy alcohol, buy cigarettes, go to a casino, get a driver's license, get a job");
    System.out.println("Type your age here :");
    int number = scan.nextInt();
    if (number >=65) {
        System.out.println("You can enroll in Medicare, Run for President, rent a car, buy alcohol, buy cigarettes, go to a casino, get a driver's license, get a job");
    }   else if (number >=35) {
        System.out.println("You can Run for President, rent a car, buy alcohol, buy cigarettes, go to a casino, get a driver's license, get a job");
    }   else if ( number >=25){
        System.out.println("You can rent a car, buy alcohol, buy cigarettes, go to a casino, get a driver's license, get a job");
    }   else if (number >=21) {
        System.out.println("You can buy alcohol, buy cigarettes, go to a casino, get a driver's license, get a job");
    }   else if (number >= 18) {
        System.out.println("You can go to a casino, get a driver's license, get a job");
    }   else if (number >= 16){
        System.out.println("You can get a driver's license, get a job");
    }   else if (number >=14){
        System.out.println("You can get a job");
    }   else{
        System.out.println("You can't do all of this ");
        scan.close();
    }

}    
}
