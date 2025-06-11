package Linear_Search_ALL;

import java.util.Arrays;

public class Max_LinearSearch {
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
    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[][] arr = {
                { 23, 4, 1},
                { 78, 18, 9},
                { 12, 3, 90},
                { 29, 30, 67}
        };
        int target = 12;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
}
