package Linear_Search_ALL;

import java.util.Arrays;

public class Search_2D {
    public static int[] Search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
                return new int[]{-1, -1};
    }
    public static void main(String[] args){
        int[][] arr = { { 23, 4, 6, 7},
                        { 34, 2, 5, 9},
                        { 89, 78, 18, 97},
                        { 56, 78, 90, 86} };
        int target = 78;
        int[] ans =Search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
