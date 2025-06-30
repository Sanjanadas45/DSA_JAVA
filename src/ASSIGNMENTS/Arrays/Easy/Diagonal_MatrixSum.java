package ASSIGNMENTS.Arrays.Easy;

public class Diagonal_MatrixSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] matrix){
        int n = matrix.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += matrix[i][i];
            totalSum += matrix[i][n - 1 -i];
        }
        // If the matrix has odd size, subtract the middle element once because it's counted twice
        if( n % 2 == 1){
            totalSum -= matrix[n / 2][n / 2];
        }
        return totalSum;
    }
}
