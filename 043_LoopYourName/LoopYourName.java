public class LoopYourName {
    public static void main(String[] args) {
        String name = "Mia Chang";
        int i = 0;
        for (i = 0; i < name.length(); i++) {
            System.out.println(name.substring(i, i + 1));
        } // i, i+1
    }
}