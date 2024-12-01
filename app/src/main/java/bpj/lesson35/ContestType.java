package bpj.lesson35;

import java.util.Arrays;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 35: 2D Arrays -- Contest Problems");

        prob01();
        prob02();
        prob03();
        prob04();
        prob05();
    }

    private static void prob01() {
        System.out.println("Problem 01");
        int[][] zorro = new int[3][4];
        for (int row = 0; row < zorro.length; row++) {
            for (int col = 0; col < zorro[row].length; col++) {
                zorro[row][col] = col + 1;
            }
        }
        System.out.println("zorro = " + Arrays.deepToString(zorro));
        System.out.println("Ans: c.");
        System.out.println("--------------------");
    }

    private static void adjust(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                --mat[row][col];
            }
        }
    }

    private static void prob02() {
        System.out.println("Problem 02");
        int[][] z = {{5, 6, 7, 8}, {1, 2, 3, 4}, {0, 1, 2, 3}};
        System.out.println("before adjust: z = " + Arrays.deepToString(z));
        adjust(z);
        System.out.println("after adjust: z = " + Arrays.deepToString(z));
        System.out.println("Ans: a.");
        System.out.println("--------------------");
    }

    private static int[][] intArray = {{11, 2}, {20, 30}, {7, 9}, {0,1}};

    private static void prob03() {
        System.out.println("Problem 03");
        System.out.println("intArray length = " + intArray.length);
        System.out.println("Ans: b. 4 rows, in the 2-d array");
        System.out.println("--------------------");
    }

    private static void prob04() {
        System.out.println("Problem 04");
        System.out.println("intArray[2] length = " + intArray[2].length);
        System.out.println("Ans: a. 2 columns for the 3rd row");
        System.out.println("--------------------");
    }

    private static void doStuff(int[][] mat) {
        int len = mat.length;
        int sec[][] = new int[len][];
        for (int j = 0; j < len; j++) {
            sec[j] = mat[len -j -1];
        }
        mat = sec;// here the value is changed.. the rows are reversed... but the parameter is passed by value; original array is not changed
    }

    private static void prob05() {
        System.out.println("Problem 05");
        int [][] d = {{-1,0,1},{5,6,7},{2,3,4}};
        doStuff(d);
        System.out.println("d = " + Arrays.deepToString(d));
        System.out.println("Ans: D. ... value of d did not change.. parameter int[][] is passed by value and not by ref");
        System.out.println("--------------------");
    }

}
