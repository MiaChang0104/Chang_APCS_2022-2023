import java.util.Scanner;
public class PerimeterAreaOfACircleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your radius in here:");
        int num = scan.nextInt();
        int circumference = (int) (2 * num * Math.PI);
        int area = (int) (num * num * Math.PI);
        System.out.println("The circumference of this is " + circumference + " The area of this is " +area);
        scan.close();
        //Math.PI
    }
}

/*

1/1 - Compiles?
0/1 - Accurate versus the instructions?
0/1 - Formatting?
-Double would be better here, especially because you're useing Pi, right?
1/1 Comments

 */