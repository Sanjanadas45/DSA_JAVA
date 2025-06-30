package ASSIGNMENTS.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }
    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }
}
