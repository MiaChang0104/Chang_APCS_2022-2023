public class PowerAttack {
    public static void main(String[] args) {
        // character
        int strength = 3;
        int attack = (int) (Math.random() * 10 + 1);
        int weapon = 4 + (int) (Math.random() * 3);
        int characterTotal = strength + attack;
        // monster
        int armor = 11;
        int monster = 13;
        while (monster > 0) {
            if (characterTotal < armor) {
                monster -= weapon;
                System.out.println("Sorry you can't attack.");

                if (monster <= 0) {
                    System.out.println("You win");
                } else {
                    System.out.println("monster have " + monster);
                }

            }

        }

    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
1/1 Comments

These comments are pretty weak. I need more going forward.

 */