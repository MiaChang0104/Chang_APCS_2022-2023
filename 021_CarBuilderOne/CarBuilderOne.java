import java.util.Scanner;
public class CarBuilderOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the year of the car you want");
        int year= scan.nextInt();
        System.out.println("Type the mileage of the car you want");
        int mileage=scan.nextInt();
        System.out.println("Type the mode of the car you want");
        String mode = scan.nextLine();
        System.out.println("Type the model of the car you want");
        String modelName=scan.nextLine();
        System.out.println("We found "+year+mileage+mode+modelName);
        scan.close();
        // add scan.close
    }
}
