package ASSIGNMENTS.Arrays.Medium;

import java.util.Arrays;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1;
        int top = 0, bottom = result[0].length - 1, left = 0, right = result[0].length - 1;
        while(top <= bottom && left <= right){
            for (int i = left; i <= right; i++) {
                result[top][i] = count++;
            }
            top ++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = count++;
            }
            right --;
            if(top <= bottom){
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = count++;
                }
                bottom --;
            }
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = count++;
                }
                left ++;
            }
        }
        return result;
    }
}
