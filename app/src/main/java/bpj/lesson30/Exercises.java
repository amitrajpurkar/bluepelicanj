package bpj.lesson30;

import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 30: Random Numbers ");
        System.out.println("--------------------------------");

        exer1();
        exer2();
        exer3();
        exer4();
        exer5();

        exer6();
        exer7();
        exer8();
        exer9();
        exer10();
    }   

    private static Random rand = new Random();
    private static int j = 0;
    private static double d = 0;

    private static void exer1() {
        System.out.println("Exercise 1: ");
        j = 201 + rand.nextInt(46);
        System.out.println("random number is " + j);
        System.out.println("Q: what range of random numbers is produced?");
        System.out.println("above produces a random number between 201 and 246");
        System.out.println("--------------------------------");
    }

    private static void exer2() {
        System.out.println("Exercise 2: ");
        d = 11 + 82.9 * rand.nextDouble();
        System.out.println("random number is " + d);
        System.out.println("Q: what range of random numbers is produced?");
        System.out.println("above produces a random number between 11 and 93.9");
        System.out.println("--------------------------------");
    }

    private static void exer3() {
        System.out.println("Exercise 3: ");
        System.out.println("Q: what range of random numbers does nextDouble produce?");
        System.out.println("above produces a random number between 0 and 1");
        System.out.println("--------------------------------");
    }

    private static void exer4() {
        System.out.println("Exercise 4: ");
        System.out.println("Q: List all numbers produced by nextInt(10)?");
        System.out.println("numbers are 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9");
        System.out.println("--------------------------------");
    }

    private static void exer5() {
        System.out.println("Exercise 5: ");
        System.out.println("Q: write code that will create an object called rd from Random class?");
        System.out.println("Random rd = new Random();");
        System.out.println("--------------------------------");
    }

    private static void exer6() {
        System.out.println("Exercise 6: ");
        System.out.println("Q: write code that will create a Random object and then use it to generate and print 20 floating point numbers in the continuos rande 22.5 <= r<= 32.5?");

        for (int i = 0; i < 20; i++) {
            d = 22.5 + rand.nextDouble() * 10;
            System.out.print(d + " ");
        }
        System.out.println("\n--------------------------------");
    }

    private static void exer7() {
        System.out.println("Exercise 7: ");
        System.out.println("Q: what import is necessary for the Random class?");
        System.out.println("import java.util.Random;");

        System.out.println("--------------------------------");
    }

    private static void exer8() {
        System.out.println("Exercise 8: ");
        System.out.println("Q: write code that will randomly generate numbers from teh following set: 18,19,20,21,22,23,24,25. Print 10 such numbers?");

        for (int i = 0; i < 10; i++) {
            j = 18 + rand.nextInt(8);
            System.out.print(j + " ");
        }
        System.out.println("\n--------------------------------");
    }

    private static void exer9() {
        System.out.println("Exercise 9: ");
        System.out.println("Q: write code that will randomly generate and print 12 numbers ONLY from the following set: 100,125,150,175?");

        for (int i = 0; i < 12; i++) {
            j = 100 + 25 * rand.nextInt(4);
            System.out.print(j + " ");
        }
        System.out.println("\n--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("Q: write a code to create a Random class object even though Random was not imported?");
        System.out.println("Random rd = new java.util.Random();");
        System.out.println("--------------------------------");
    }
}
