package bpj.lesson30;

import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        System.out.println("Generate Random Integers: ");
        generateRandomIntegers();

        System.out.println("Generate Random Doubles: ");
        generateRandomDoubles();
    }

    /**
     * generate 33 random integers in the inclusive range from 71 to 99
     */
    private static void generateRandomIntegers() {
        int lowest_value = 71;
        int highest_value = 99;
        System.out.println("generate 33 random integers in the inclusive range from "+lowest_value+" to "+highest_value);

        int max_range = highest_value - lowest_value + 1;
        System.out.println("max range is "+max_range);
        int count = 0, r = 0;

        Random rand = new Random();
        for (int i = 0; i < 33; i++) {
            r = lowest_value + rand.nextInt(max_range);
            System.out.print(r + " ");

            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n--------------------------------");
    }

    /**
     * generate 27 random doubles in the inclusive range from 99.78 to 147.22
     */
    private static void generateRandomDoubles() {
        double lowest_value = 99.78;
        double highest_value = 147.22;
        System.out.println("generate 27 random doubles in the inclusive range from "+lowest_value+" to "+highest_value);

        double max_range = highest_value - lowest_value;
        System.out.println("max range is "+max_range);
        int count = 0;
        double r = 0;

        Random rand = new Random();
        for (int i = 0; i < 27; i++) {
            r = lowest_value + rand.nextDouble() * max_range;
            System.out.print(r + " ");

            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n--------------------------------");
    }
}
