import java.util.Scanner;
public class DistanceAcrossEarth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your first latitude");
        int FirstLatitude = scan.nextInt();
        System.out.println("Type your first longitude");
        int Firstlongitude = scan.nextInt();
        System.out.println("Type your second latitude");
        int SecongLatitude = scan.nextInt();
        System.out.println("Type your second longitude");
        int Secondlongitude = scan.nextInt();
        double DistanceLatitude = (FirstLatitude -SecongLatitude);
        double DistanceLlongitude = (Firstlongitude - Secondlongitude);
        double Distance = (double) (DistanceLatitude*DistanceLatitude + DistanceLlongitude*DistanceLlongitude);
        System.out.println("The distance is "+Distance);
        scan.close();

        
    }
}
