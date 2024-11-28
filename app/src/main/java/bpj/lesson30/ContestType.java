package bpj.lesson30;

import java.util.Random;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 30: Random Numbers -- Contest Type Problems");
        System.out.println("--------------------------------");

        prob01();
        prob02();
        prob03();
        prob04();
        prob05();
        prob06();
        prob07();
        prob08();
    }

    private static void prob01() {
        System.out.println("Problem 1: ");
        System.out.println("Q: what is the possible output of below code?");
        Random rd = new Random();
        System.out.println(rd.nextInt(36));
        System.out.println("Ans: A. 0 is the possible output... it gives numbers from 0 to 35");
        System.out.println("--------------------------------");
    }

    private static int rollADice() {
        Random rd = new Random();
        return rd.nextInt(1, 7) ;
    }

    private static void prob02() {
        System.out.println("Problem 2: ");
        int dice_number  = rollADice();
        System.out.println("Dice number is " + dice_number);
        System.out.println("Q: to simulate rolling a six-sided die, what code would you write?");
        System.out.println("Ans: D. 1 + rdm.nextInt(6)");
        System.out.println("--------------------------------");
    }

    private static void prob03() {
        System.out.println("Problem 3: ");
        System.out.println("Q: what is the possible output of below code?");
        java.util.Random rd = new java.util.Random();
        System.out.println(1 + 5 * rd.nextDouble());
        System.out.println("Ans: D 6.0 is the possible output... it gives numbers from 1 to 6");
        System.out.println("--------------------------------");
    }

    private static double genRndDbl(int m, int a) {
        Random rd = new Random();
        return a + m * rd.nextDouble();
    }

    private static void prob04() {
        System.out.println("Problem 4: ");
        System.out.println("Q: what would be the range of possibel values of db: double db = genRndDbl(4, 1);?");
        double db = genRndDbl(4, 1);
        System.out.println("Ans: D. 1 <= db <= 5");
        System.out.println("--------------------------------");
    }

    private static void prob05() {
        System.out.println("Problem 5: ");
        Random ri = new Random();
        int i = 20 + 15 * ri.nextInt(5);
        System.out.println("Q: what code with produce the random numbers only from: 20, 35, 50, 65?");
        System.out.println("Ans: B. i = 20 + 15 * ri.nextInt(5);");
        System.out.println("--------------------------------");
    }

    private static void prob06() {
        System.out.println("Problem 6: ");
        System.out.println("Q: when a class has more than one method of same name, what is this called?");
        System.out.println("Ans: A. Overloading");
        System.out.println("--------------------------------");
    }

    private static void prob07() {
        System.out.println("Problem 7: ");
        System.out.println("Q: which of the followign tosses a Coin object named theCoin, and produces a true when the toss() method yields a HEADS?");
        System.out.println("Ans: C. theCoin.toss() == Coin.HEADS");
        System.out.println("--------------------------------");
    }

    private static void prob08() {
        System.out.println("Problem 8: ");
        System.out.println("Q: assuming that the Random class is perfect and generates all of teh integers with equal probability, what is the probability that toss() returns a HEADS?");
        System.out.println("Ans: D. exactly .5 -- or 50%");
        System.out.println("--------------------------------");
    }
}
