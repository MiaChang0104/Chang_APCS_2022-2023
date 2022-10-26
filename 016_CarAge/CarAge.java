public class CarAge {

    public static void main(String[] args) {
        ReturningCalculator calculator = new ReturningCalculator();
        Car car1 = new Car(2011, 201, "M", "4", true);

        Car car2 = new Car(2012, 200, "A", "4", true);

        Car car3 = new Car(2013, 199, "C", "4", true);

        Car car4 = new Car(2014, 198, "D", "4", true);

        int year = 2022;

        System.out.println(calculator.integerSubtractor(year, car1.year));
        System.out.println(calculator.integerSubtractor(year, car2.year));
        System.out.println(calculator.integerSubtractor(year, car3.year));
        System.out.println(calculator.integerSubtractor(year, car4.year));
    }
}