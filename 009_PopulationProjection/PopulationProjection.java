public class PopulationProjection {
    public static void main(String[] args) {
        int population = 312032486;
        int time = 365 * 24 * 60 * 60;
        int birth = 7;
        int death = 13;
        int imm = 45;

        int numberOfBirth = time / birth;
        int numberOfDeath = time / death;
        int muberOfImm = time / imm;
        for (int i = 1; i <= 5; i++) {
            population += numberOfBirth + muberOfImm - numberOfDeath;
            System.out.println(i + "years" + "=" + population);
        }
    }
}
//