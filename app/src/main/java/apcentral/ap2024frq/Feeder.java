package apcentral.ap2024frq;

public class Feeder {
    /**
     * the amount of food, in grams, currently in the bird feeder.
     * initialized in the constructor, and
     * always greater than or equal to 0
     */
    private int currentFood;

    public Feeder(int initialFood) {
        if (initialFood < 0) {
            //throw new IllegalArgumentException("initialFood must be >= 0");
            currentFood = 0;
        }
        currentFood = initialFood;
    }
    
    public int getCurrentFood() {
        return currentFood;
    }

    /**
     * simulates one day with numBirds birds or bear feeding at bird feeder, as described in part a
     * @param numBirds
     * precondition: numBirds > 0
     */
    /**
     * part a:
     * write the simulateOneDay method, which simulates numBirds birds, or possibly a bear at the feeder for one day.
     * the method determines the amount of food taken from the feeder on this day and updates the currentFood instance variable.
     * the simulation accounts for normal conditions, which occur 95% of the time, and a day with no food, which occurs 5% of the time.
     * 
     * under normal conditions, the simulation assumes that on a given day, only birds visit the feeder and that each bird at the feeder consumes same amount of food. this standard amount consumed is about 10 to 50 grams, inclusive, in 1-gram increments. that is on any given day, each bird might eat 10, 11, 12, ... 49, 50 grams. the amount of food eaten by a bird on a given day is randomly generated and each integer 10 to 50, inclusive, has equal chance of being chosen.
     * 
     * for example a run of the simulation might predict that for a certain day under normal conditions, each bird coming to the feeder will eat 11 grams of food. if 10 birds come to the feeder on that day, then a total of 110 grams of food will be consumed.
     * 
     * if the simulated food consumed is greater than the amount of food in the feeder, the birds empty the feeder and the amount of food in the feeder at the end of the day is zero.
     * 
     * under abnormal conditions, a bear empties the feeder and the amount of food in the feeder at the end of the day is zero.
     * 
     * the following examples show possible results of the simulation:
     * 1) feeder initially has 500gms, simulateOneDay(12) results in 12 birds eating 20gms each, leaving 260gms in the feeder
     * 2) feeder initially has 1000gms, simulateOneDay(22) results in a bear eating all food, leaving 0gms in the feeder
     * 3) feeder initially has 100gms, simulateOneDay(5) results in 5 birds eating 30gms each, leaving 0gms in the feeder as initial amount is less than 150.
     */
    public void simulateOneDay(int numBirds) {
        if (numBirds < 0) {
            throw new IllegalArgumentException("numBirds must be >= 0");
        }
        System.out.println("--- Simulating One Day ---");
        System.out.println("Day starts with " + currentFood + " grams of food in the feeder.");
        if (isBear()) {
            System.out.println("abnormal conditions: The bear emptied the feeder.");
            currentFood = 0;
        } else {
            // 95% of the time, normal conditions occur
            System.out.println("normal conditions: " + numBirds + " birds visited the feeder.");
            int stdAmount = standardAmount();//random number between 10 and 50, inclusive
            int foodConsumed = numBirds * stdAmount;
            currentFood -= foodConsumed;
            if (currentFood < 0) {
                currentFood = 0;
            }
            System.out.println("The birds consumed " + foodConsumed + " grams of food.");
            //System.out.println("The amount of food in the feeder at the end of the day is " + currentFood + " grams.");
        }
        System.out.println("Feeder has " + getCurrentFood() + " grams of food left.");
        System.out.println("--- End of Day ---");
    }

    // 5% of the time, abnormal conditions occur, the bear empties the feeder
    private boolean isBear() {
        if (Math.random() < 0.05) return true;
        else return false;
    }

    /**
     * generates standart amount of food consumed by a bird, a random number between 10 and 50, inclusive
     * @return
     */
    private int standardAmount() {
        return (int) Math.ceil(Math.random() * 40 + 10);
    }

    /**
     * returns the number of days, the birds or a bear, found food to eat at the feeder in this simulation as described in part b
     * @param numBirds
     * @param numDays
     * @return
     * precondition: numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) {
        if (numBirds < 0) {
            throw new IllegalArgumentException("numBirds must be >= 0");
        }
        for (int i = 0; i < numDays; i++) {
            simulateOneDay(numBirds);
            System.out.println("Day " + (i + 1) + ": simulateOneDay leaves " + currentFood + " grams of food in the feeder.");
        }
        return currentFood;
    }
}
