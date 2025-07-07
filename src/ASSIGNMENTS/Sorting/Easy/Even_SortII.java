//Sort Array By Parity II

//Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
//Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
//Return any answer array that satisfies this condition.

package ASSIGNMENTS.Sorting.Easy;

import java.util.Arrays;

public class Even_SortII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sort(nums)));
    }
    public static int[] sort(int[] nums){
        int[] arr = new int[nums.length];
        int even = 0, odd = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                arr[even] = nums[i];
                even += 2;
            }
            else{
                arr[odd] = nums[i];
                odd += 2;
            }
        }
        return arr;
    }
}
