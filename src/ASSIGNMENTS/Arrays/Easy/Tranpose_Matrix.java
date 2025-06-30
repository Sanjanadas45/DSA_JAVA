package ASSIGNMENTS.Arrays.Easy;

import java.util.Arrays;

public class Tranpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix(matrix)));
    }
    public static int[][] matrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] tranposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tranposed[j][i] = matrix[i][j];
            }
        }
        return tranposed;
    }
}
