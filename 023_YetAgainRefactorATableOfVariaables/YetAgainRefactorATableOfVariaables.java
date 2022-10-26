import java.util.Scanner;
public class YetAgainRefactorATableOfVariaables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your frst number");
        int num = scan.nextInt();
        System.out.println("Type your second number");
        int num2 = scan.nextInt();
        System.out.println("Type your third number");
        int num3 = scan.nextInt();
        System.out.println(num + "^2 is " +Math.pow(num,num));
        System.out.println(num +"^3 is "+Math.pow(num,num)*num);
        System.out.println(num2 + "^2 is "+Math.pow(num2,num2));
        System.out.println(num2+"^3 is "+Math.pow(num2,num2)*num2);
        System.out.println(num3+"^2 is "+Math.pow(num3,num3));
        System.out.println(num3+"^3 is "+Math.pow(num3,num3)*num);
        scan.close();
        //use Math.pow
   }
    
}
