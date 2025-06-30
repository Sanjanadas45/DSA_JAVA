//Build Array from Permutation
package ASSIGNMENTS.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArray_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(array(arr)));
    }
    public static int[] array(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
