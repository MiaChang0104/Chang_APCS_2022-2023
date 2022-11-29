public class PowerAttack {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10 + 1);
        int number1 = (int) (Math.random() * 10 + 1);
        int character = number + 3;
        int character1 = number1 + 3;
        int totalMonster = 11 + 13;
        int weapon = (int) (Math.random() * 6 + 4);
        int weapon1 = (int) (Math.random() * 6 + 4);
        int totalAttack = character + weapon;
        int totalAttack1 = character1 + weapon1;
        System.out.println("First attack is " + character);
        System.out.println("Second attack is " + character1);
        
    }
}
