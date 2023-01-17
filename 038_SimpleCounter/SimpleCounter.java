import java.util.Scanner;

public class SimpleCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type one number here: ");
        int num = scan.nextInt();
        int i = 0;
        while (i < num) {
            i++;
            System.out.println(i);
        } scan.close();

    }
}
// i++;

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
1/1 Comments

These comments are pretty weak. I need more going forward.

 */