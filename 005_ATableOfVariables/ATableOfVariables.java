public class ATableOfVariables {
    public static void main(String[] args) {
        System.out.println("a   a^2   a^3");
        int a = 1;
        for (int i = 1; i <= 4; i++) {
            int aSquared = a * a;
            
            // a^2
            int aCube = a * a * a;
            System.out.println(a + "   " + aSquared + "     " + aCube);
            // a^3
            a = a + 1;
        }
    }

}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
1/1 Comments

 */