public class ReturningCalculator1 {
    public static void main(String[] args) {
        ReturningCalculator calculator = new ReturningCalculator();
        System.out.println((calculator.doubleMultiplier(9.5, 4.5)
                - calculator.doubleMultiplier(2.5, 3)) / calculator.doubleSubtractor(45.5, 3.5));
    // add()
        }
}
