public class Pokemon {
    
   
    private String name;
        private int hp;
        private int attack;
        private int defense;
        private int specialAttack;
        private int specialDefense;
        private int speed;
    
        public Pokemon(String name, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed) {
            this.name = name;
            this.hp = hp;
            this.attack = attack;
            this.defense = defense;
            this.specialAttack = specialAttack;
            this.specialDefense = specialDefense;
            this.speed = speed;
        }
    
        public String getName() {
            return name;
        }
    
        public int getHp() {
            return hp;
        }
    
        public int getAttack() {
            return attack;
        }
    
        public int getDefense() {
            return defense;
        }
    
        public int getSpecialAttack() {
            return specialAttack;
        }
    
        public int getSpecialDefense() {
            return specialDefense;
        }
    
        public int getSpeed() {
            return speed;
        }
    
        public void attack() {
            System.out.println(name + " attacked!");
        }
    
        public void defend() {
            System.out.println(name + " defended!");
        }
    }