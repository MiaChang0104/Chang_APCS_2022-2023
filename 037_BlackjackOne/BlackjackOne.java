import java.util.Scanner;
public class BlackjackOne {
    public static void main(String[] args) {
        String [] number = new String []{"A","2","3","4","5","6","7","8","9","J","Q","K"};
        int index = (int) (Math.random()*number.length);
        int second = (int)(Math.random()*number.length);
        int third = (int) (Math.random()*number.length);
        System.out.println("First card is "+number[index]);
        int point = 0;
        int points = 0;
        int pointss=0;
        if (index>8){
              point=10;
            System.out.println("You got " +point+" points");
        } else {
            point =index+1;
            System.out.println("You got " +point+" points");
        }
        System.out.println("Second card is "+number[second]);
        if (second>8){
            points=10;
            System.out.println("You got " +points+" points");
        } else {
            points = second+1;
            System.out.println("You got " +points+" points");
        }
        int total = point + points;
        System.out.println("Total points is " + total);
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to hit or stay?");
        String answer = scan.nextLine();
        if (answer.equals("stay")){
            System.out.println("Third card is "+number[third]);
        if (third>8){
            pointss=10;
            System.out.println("You got " +pointss+" points");
        } else {
            pointss = third+1;
            System.out.println("You got " +pointss+" points");
        }// use if
          int total1=points+point+points;
          System.out.println("Total points is " + total1);
          if (total1>=21){
            System.out.println("you lose");
          } else {
            System.out.println("You win");
          }
            } else{
                System.out.println("broken");
            }scan.close();
    }
    
}
