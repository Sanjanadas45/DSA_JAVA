package ASSIGNMENTS.Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Three_Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
//    Steps to solve this problem:
//1. Sort the Array: Sort the input array. This makes it easier to avoid duplicates and use the two-pointer technique.

//2. Iterate Over the Array: Use a for loop to fix the first element of the triplet.

//3. Two Pointers: For each fixed element, use two pointers (left and right) to find pairs that sum to the negative of the fixed element.

//4. Skip Duplicates: Skip duplicate values to ensure the uniqueness of each triplet.
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); //Arrays.asList is a method in Java that converts an array into a List

                    while (left < right && nums[left] == nums[left + 1]) left++; // Skip duplicates
                    while (left < right && nums[right] == nums[right - 1]) right--; // Skip duplicates
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
