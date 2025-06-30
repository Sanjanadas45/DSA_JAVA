//Number of Good Pairs
package ASSIGNMENTS.Arrays.Easy;

import java.util.Scanner;

public class Good_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(good(nums));
    }
    public static int good(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
