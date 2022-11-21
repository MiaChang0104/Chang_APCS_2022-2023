import java.util.Scanner;
public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Type your Annual Interest Rate");
       int Annual_Interest_Rate = scan.nextInt();
        System.out.println("Type your principal Balance");
        int principal_Balance = scan.nextInt();
        System.out.println("Type your Remaining Months");
        int Remaining_Months = scan.nextInt();

        ReturningCalculator calculator = new ReturningCalculator();
        
        int number = (calculator.integerMultiplier(principal_Balance, calculator.integerSubtractor(Annual_Interest_Rate, Remaining_Months)));
        System.out.println(number);
        System.out.println(calculator.integerSubtractor(principal_Balance, Remaining_Months)-number);
        scan.close();
//use int
    }
    
}
