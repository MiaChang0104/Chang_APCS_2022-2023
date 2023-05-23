public class TierList  {
    public static void main(String[] args) {
        String[][] tierList = {
            {"1", "2", "3", "4"},
            {"A", "B", "C", "D"},
            {"5", "6", "7", "8"},
            {"E", "F", "G", "H"}
        };

        printTierList(tierList);
    }

    public static void printTierList(String[][] tierList) {
        for (String[] tier : tierList) {
            for (String language : tier) {
                System.out.print(language + " ");
            }
            System.out.println();
        }
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
0/1 Comments

 */