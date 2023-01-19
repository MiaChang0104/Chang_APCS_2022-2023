import java.util.Scanner;

public class DateTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which date do you want to use? (European/American)");
        String type = scan.nextLine();
        System.out.println("Type the day here:");
        int day = scan.nextInt();
        System.out.println("Type the month here:");
        int month = scan.nextInt();
        System.out.println("Type the year here:");
        int year = scan.nextInt();
        if (type.equals("European")) {
            European(day, month, year);
        } else if (type.equals("American")) {
            American(day, month, year);
        } else {
            System.out.println("break");
        }

    }//put if in main

    public static void European(int day, int month, int year) {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void American(int day, int month, int year) {
        System.out.println(month + "/" + day + "/" + year);
    }
}

/*
 * 
 * This one isn't done. I'll mark it as missing for now and come back.
 * 
 */