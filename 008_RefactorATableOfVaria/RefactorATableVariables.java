public class RefactorATableVariables {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 4; i++) {
            int b = a * a;
            System.out.println(a + "*" + a + "=" + b);
            // a^2
            b = a * a * a;
            System.out.println(a + "*" + a + "*" + a + "=" + b);
            // a^3
            a = a + 1;
        }
    }

}
