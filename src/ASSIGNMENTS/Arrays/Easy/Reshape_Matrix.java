package ASSIGNMENTS.Arrays.Easy;

import java.util.Arrays;

public class Reshape_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(m * n != r * c) return mat;

        int[][] result = new int[r][c];
        for (int i = 0;  i< m * n ; i++) { //Loops through each element as if the matrix is a single list of length m*n.
//            mat[i / n][i % n]: Gets the element at the ith position in the original matrix (row-major order).
//            result[i / c][i % c]: Places the element into the reshaped matrix at the right row and column.
            result[i / c][i % c] = mat[i / n][i % n];
//            i / n is the row in the original, i % n is the column.
//            i / c is the row in the result, i % c is the column.
        }
        return result;
    }
}
