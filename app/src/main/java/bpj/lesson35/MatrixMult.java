package bpj.lesson35;

public class MatrixMult {
    public static int[][] multiply(int[][] first, int[][] second) {
        //step 1: matrices can be mulitplied only if the number of columns in the first matrix is equal to the number of rows in the second matrix
        if (first[0].length != second.length) {
            return null;
        }

        //step 2: product matrix dimensions: same number of rows as the first matrix and same number of columns as the second
        int[][] product = new int[first.length][second[0].length];

        //step 3: calculate dot-product: elements of nth row of the first matrix multiplied by corresponding elements of nth column of the second matrix and summed
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < second.length; k++) {
                    product[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return product;
    }
}
