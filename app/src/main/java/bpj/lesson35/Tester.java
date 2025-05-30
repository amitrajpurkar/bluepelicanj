package bpj.lesson35;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[][] a = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
        int[][] b = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};

        int[][] product = MatrixMult.multiply(a, b);
        System.out.println("product = " + Arrays.deepToString(product));
        for (int row = 0; row < product.length; row++) {
            for (int col = 0; col < product[row].length; col++) {
                System.out.print( product[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}
