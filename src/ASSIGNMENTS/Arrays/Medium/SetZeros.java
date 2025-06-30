//Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
package ASSIGNMENTS.Arrays.Medium;

public class SetZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        stzeros(matrix);
    }
    public static void stzeros(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean rowsZeros = false;
        boolean colsZeros = false;

//        Check if first row contains zeros
        for (int i = 0; i < cols; i++) {
            if(matrix[0][i] == 0){
                rowsZeros = true;
                break;
            }
        }
//        Check if first col contains zeros
        for (int i = 0; i < rows; i++) {
            if(matrix[i][0] == 0){
                colsZeros = true;
                break;
            }
        }
//        Use first row & col as marked
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
//        Set marked row to zero
        for (int r = 1; r < rows; r++) {
            if (matrix[r][0] == 0) {
                for (int c = 1; c < cols; c++) {
                    matrix[r][c] = 0;
                }
            }
        }
//        Set marked col to zero
        for (int c = 1; c < cols; c++) {
            if(matrix[0][c] == 0){
                for (int r = 1; r < rows; r++) {
                    matrix[r][c] = 0;
                }
            }
        }
//        Set first row to zero if needed
        if(rowsZeros){
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }
//        Set first col to zeros if needed
        if(colsZeros){
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
