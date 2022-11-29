public class PowerAttack {
    public static void main(String[] args) {
        //character
        int strength = 3;
        int attack = (int)(Math.random()*10+1);
        int weapon = 4+(int)(Math.random()*3);
        int characterTotal = strength + attack;
        //monster
        int armor = 11;
        int monster=13;
        while (characterTotal>=armor){
            monster-=weapon;
            System.out.println("Monster only have" +monster );
        }
    }
}
