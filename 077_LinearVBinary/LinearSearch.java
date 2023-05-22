public class LinearSearch {
    public static void main(String[] args) {
        int[] sortedNumbers = {};

        int number1 = 8388;
        int number2 = 9807;
        int number3 = 4011;
        int number4 = 5423;

        int index1 = linearSearch(sortedNumbers, number1);
        int index2 = linearSearch(sortedNumbers, number2);
        int index3 = linearSearch(sortedNumbers, number3);
        int index4 = linearSearch(sortedNumbers, number4);

        System.out.println("Linear Search Results:");
        System.out.println(number1 + " found at index: " + index1 + " | Iterations: " + (index1 + 1));
        System.out.println(number2 + " found at index: " + index2 + " | Iterations: " + (index2 + 1));
        System.out.println(number3 + " found at index: " + index3 + " | Iterations: " + (index3 + 1));
        System.out.println(number4 + " found at index: " + index4 + " | Iterations: " + (index4 + 1));
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}