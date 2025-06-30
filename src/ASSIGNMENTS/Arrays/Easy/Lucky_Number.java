package ASSIGNMENTS.Arrays.Easy;
import java.util.ArrayList;
import java.util.List;

public class Lucky_Number {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int colind = 0;
        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    colind=j;
            }
        }
            boolean flag = true;
            for(int c = 0;c < rows;c++){
                if(matrix[c][colind]>min){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res.add(min);
            }
        }
        return res;
    }
}
