package bpj.lesson35;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 35: 2D Arrays");

        exer01();
        exer02();
        exer03();
        exer04();
        exer05();

        exer06();
        exer07();
        exer08();
        exer09();
        exer10();

        exer11();
        exer12();
        exer13();
        exer14();
        exer15();
        
        exer16();
    }

    private static final int[][] a = { { 5, -16, 9, 21 }, { 22, 19, -101, 36 }, { 18, 17, 64, -2 } };

    private static void exer01() {
        System.out.println("exer01");
        System.out.println("write code to create 2-d array in single line");
        System.out.println("int[][] a = { { 5, -16, 9, 21 }, { 22, 19, -101, 36 }, { 18, 17, 64, -2 } };");
        System.out.println("--------------------");
    }

    private static void exer02() {
        System.out.println("exer02");
        System.out.println("write code to print array element occupied by -101");
        System.out.println("a[1][2] = "+a[1][2]);
        System.out.println("--------------------");
    }

    private static void exer03() {
        System.out.println("exer03");
        System.out.println("the above table can be described as ?");
        System.out.println("Ans: d. a/b/c: an array, a matrix or subscripted variables");
        System.out.println("--------------------");
    }

    private static void exer04() {
        System.out.println("exer04");
        System.out.println("write code to print the number of rows in matrix a");
        System.out.println("a.length = "+a.length);
        System.out.println("--------------------");
    }

    private static void exer05() {
        System.out.println("exer05");
        System.out.println("write code to print the number of columns in row of index 2");
        System.out.println("a[2].length = "+a[2].length);
        System.out.println("--------------------");
    }

    private static void exer06() {
        System.out.println("exer06");
        System.out.println("what is printed by System.out.println(a[1][3]);");
        System.out.println("Ans: 36, which is the fourth element in the second row");
        System.out.println("--------------------");
    }

    private static void exer07() {
        System.out.println("exer07");
        System.out.println("what is printed by below?");

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Ans: it prints the array, one row per line");
        System.out.println("--------------------");
    }

    private static void exer08() {
        System.out.println("exer08");
        System.out.println("what is printed by below?");

        Arrays.sort(a[0]);
        System.out.println(Arrays.binarySearch(a[0], 5));
        System.out.println("Ans: after sorting row 1, element 5 is at index 1");
        System.out.println("--------------------");
    }

    private static void exer09() {
        System.out.println("exer09");
        System.out.println("what is printed by below?");
        Arrays.sort(a[0]);
        System.out.println(Arrays.binarySearch(a[0], 0));
        System.out.println("Ans: after sorting row 1, searching a non-existing element returns (-1 - 1)");
        System.out.println("--------------------");
    }

    private static void exer10() {
        System.out.println("exer10");
        System.out.println("what is printed by below -- row * col?");

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = row * col;
            }
        }
        System.out.println("a = "+Arrays.deepToString(a));

        System.out.println("--------------------");
    }

    private static void exer11() {
        System.out.println("exer11");
        System.out.println("what is printed by below -- fill row-3 by -156?");
        Arrays.fill(a[2], -156);
        System.out.println("a = "+Arrays.deepToString(a));
        System.out.println("--------------------");
    }

    private static void exer12() {
        System.out.println("exer12");
        System.out.println("must all two dimensional arrays have same number of columns in each row?");
        System.out.println("Ans: no, they can have different number of columns -- this is also called Ragged Arrays");

        System.out.println("--------------------");
    }

    private static void exer13() {
        System.out.println("exer13");
        double[][] b = new double[8][25];
        System.out.println(b[4][2]);
        System.out.println("--------------------");
    }

    private static void exer14() {
        System.out.println("exer14");
        System.out.println("what is printed by below -- when x, y are identical integer arrays?");
        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] y = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Arrays.equals(x, y) = "+Arrays.equals(x, y));
        System.out.println("Arrays.deepEquals(x, y) = "+Arrays.deepEquals(x, y));

        System.out.println("--------------------");
    }

    private static void exer15() {
        System.out.println("exer15");
        System.out.println("is it possible to sort z a two dimensional array with Arrays.sort(z)?");
        System.out.println("Ans: no, it is not possible -- you can sort a one dimensional array with Arrays.sort(z[0])");
        System.out.println("--------------------");
    }

    private static void exer16() {
        System.out.println("exer16");
        System.out.println("is it possible to use one of the sort methods of the Arrays class to sort a single row (index 3) of a two dimensional matrix g?");
        System.out.println("Ans: yes, Arrays.sort(g[3])");
        int[][] g = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {14, 11, 12}};
        System.out.println("before sort g[3] = " + Arrays.toString(g[3]));
        Arrays.sort(g[3]);
        System.out.println("after sort g[3] = " + Arrays.toString(g[3]));
        System.out.println("--------------------");
    }
}
