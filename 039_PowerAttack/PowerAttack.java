public class PowerAttack {
    public static void main(String[] args) {
    int number = (int) (Math.random()*10+1);
    int character = number+3;
    int TotalMonster=11 +13;
    int weapon = (int) (Math.random()*6+4);
    int TotalAttack = character+weapon;
    while (TotalAttack<TotalMonster){
        TotalMonster-=TotalAttack;
        System.out.println("First term Mondter only have " + TotalMonster);
    }

    
    }
}
