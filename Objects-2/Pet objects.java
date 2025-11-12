//By Gunnar Pettit
//For Kim Gross
//Software Development
public class Pet {
     
        private String name;
        private String species;
        private int age;
        private int energy;

        public Pet(String name, String species, int age) {
            this.name = name;
            this.species = species;
            this.age = age;
            this.energy = 100;
        }

        public String describe() {
            return name + " is a " + age + "-year-old " + species + " with " + energy + "% energy.";
        }

        public void play(int minutes) {
            if (energy <= 0) {
                System.out.println(name + " is too tired to play.");
            } else {
                int energyLoss = minutes * 5;
                energy = Math.max(0, energy - energyLoss);
                System.out.println(name + " played for " + minutes + " minutes and now has " + energy + "% energy.");
            }
        }

        public void feed(int foodAmount) {
            int energyGain = foodAmount * 10;
            energy = Math.min(100, energy + energyGain);
            System.out.println(name + " ate and now has " + energy + "% energy.");
        }
    }
