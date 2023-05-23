public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedNumbers = { /* sorted array of 1000 random numbers */ };

        int number1 = 8388;
        int number2 = 9807;
        int number3 = 4011;
        int number4 = 5423;

        int index1 = binarySearch(sortedNumbers, number1);
        int index2 = binarySearch(sortedNumbers, number2);
        int index3 = binarySearch(sortedNumbers, number3);
        int index4 = binarySearch(sortedNumbers, number4);

        System.out.println("Binary Search Results:");
        System.out.println(number1 + " found at index: " + index1 + " | Iterations: " + (index1 + 1));
        System.out.println(number2 + " found at index: " + index2 + " | Iterations: " + (index2 + 1));
        System.out.println(number3 + " found at index: " + index3 + " | Iterations: " + (index3 + 1));
        System.out.println(number4 + " found at index: " + index4 + " | Iterations: " + (index4 + 1));
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int iterations = 0;

        while (left <= right) {
            int mid = (left + right) / 2;


            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            }
        }
        return iterations;
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
0/1 Comments

 */