import java.util.Scanner;
public class PerimeterAreaOfAHexagonCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your side length");
        int side = scan.nextInt();
        int perimeter = (int) (6 * side);
        Double area = (Double) ((Math.sqrt(3)*3*Math.pow(side, side))/2);
        System.out.println("The perimeter is " + perimeter + " The area is " + area);
        scan.close();
      //Math.pow(doublex,doubley)  

    }
}

/*

1/1 - Compiles?
0/1 - Accurate versus the instructions?
-That area calculation is not correct.
1/1 - Formatting?
1/1 Comments

 */