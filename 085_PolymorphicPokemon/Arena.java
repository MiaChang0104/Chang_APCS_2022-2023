public class Arena {
    public static void main(String[] args) {
        String[] abilities = {"Ability 1", "Ability 2", "Ability 3"};

        Aspecificpokemon specificPokemon = new Aspecificpokemon("SpecificPokemon", 100, 50, 60, 70, 80, 90, abilities);

        Pokemon pokemon = specificPokemon; // Upcasting

        System.out.println("Pokemon Stats:");
        System.out.println("Name: " + pokemon.getName());
        System.out.println("HP: " + pokemon.getHp());
        System.out.println("Attack: " + pokemon.getAttack());
        System.out.println("Defense: " + pokemon.getDefense());
        System.out.println("Special Attack: " + pokemon.getSpecialAttack());
        System.out.println("Special Defense: " + pokemon.getSpecialDefense());
        System.out.println("Speed: " + pokemon.getSpeed());

        System.out.println();

        specificPokemon.useAbility(1);
    }
}