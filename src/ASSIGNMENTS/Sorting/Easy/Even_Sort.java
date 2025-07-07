//Sort Array By Parity

//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//Return any array that satisfies this condition.
package ASSIGNMENTS.Sorting.Easy;

import java.util.Arrays;

public class Even_Sort {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(evenSort(nums)));
    }
    public static int[] evenSort(int[] nums){
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }
}
