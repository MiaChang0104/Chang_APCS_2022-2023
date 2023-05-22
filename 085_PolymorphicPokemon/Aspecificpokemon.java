public class Aspecificpokemon extends Pokemon {
    private String[] abilities;

    public Aspecificpokemon(String name, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, String[] abilities) {
        super(name, hp, attack, defense, specialAttack, specialDefense, speed);
        this.abilities = abilities;
    }

    public void useAbility(int index) {
        if (index >= 0 && index < abilities.length) {
            System.out.println(getName() + " used ability: " + abilities[index]);
        } else {
            System.out.println("Invalid ability index!");
        }
    }
}