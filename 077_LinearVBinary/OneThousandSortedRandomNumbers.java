import java.util.Arrays;

public class OneThousandSortedRandomNumbers {
    public static int[] getSortedNumbers() {
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = (int) (Math.random() * 10000) + 1;
        }
        Arrays.sort(numbers);
        return numbers;
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
0/1 Comments

 */