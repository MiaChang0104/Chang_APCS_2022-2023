public class PopulationProjection {
    public static void main(String[] args) {
        int Population=312032486;
        int time=365*24*60*60;
        int birth=7;
        int death=13;
        int imm=45;

        int number_of_birth=time/birth;
        int number_of_death=time/death;
        int muber_of_imm=time/imm;
        for (int i=1; i<=5; i++){
            Population+=number_of_birth+muber_of_imm-number_of_death;
            System.out.println(i+"years"+"="+Population);
        }
    }
}
