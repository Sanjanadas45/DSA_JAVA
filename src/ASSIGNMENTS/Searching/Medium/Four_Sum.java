package ASSIGNMENTS.Searching.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Four_Sum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Handle edge case: if the array has less than 4 elements, no quadruplet can be formed.
        if (nums == null || nums.length < 4) {
            return result;
        }

        // Step 1: Sort the array. This is crucial for skipping duplicates and using the two-pointer technique efficiently.
        Arrays.sort(nums);
        int n = nums.length;

        // Step 2: Outer loops to fix the first two elements (nums[i] and nums[j]).
        // i iterates from the first element up to n-4 (to ensure there are at least 3 elements remaining for j, left, right).
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate elements for 'i' to avoid duplicate quadruplets.
            // If the current element is the same as the previous one, it will form
            // the same combinations, so skip it.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Optimization: Pruning the search space.
            // If the sum of the current nums[i] and the three smallest numbers
            // after it is already greater than the target, then any further
            // combinations with this nums[i] will also be greater.
            // Since the array is sorted, we can break early.
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            // Optimization: Pruning the search space.
            // If the sum of the current nums[i] and the three largest numbers
            // (last three elements of the array) is less than the target,
            // then nums[i] is too small to reach the target, even with the largest possible values.
            // We can continue to the next 'i'.
            if ((long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target) {
                continue;
            }

            // j iterates from i+1 up to n-3 (to ensure there are at least 2 elements remaining for left, right).
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate elements for 'j'.
                // If the current element is the same as the previous one, skip it.
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Optimization: Pruning the search space for j.
                // Similar to the i-loop, check if this combination can possibly hit the target.
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if ((long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target) {
                    continue;
                }

                // Step 3: Two-pointer technique for the remaining two elements.
                int left = j + 1;
                int right = n - 1;

                long remainingTarget = (long) target - nums[i] - nums[j]; // Use long to avoid overflow

                while (left < right) {
                    long currentSum = (long) nums[left] + nums[right]; // Use long for sum to avoid overflow

                    if (currentSum == remainingTarget) {
                        // Found a quadruplet! Add it to the result list.
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Step 4: Skip duplicates for 'left' and 'right' pointers.
                        // Move 'left' past any duplicate values.
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Move 'right' past any duplicate values.
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        // Move both pointers inward to search for other unique pairs.
                        left++;
                        right--;
                    } else if (currentSum < remainingTarget) {
                        // Current sum is too small, need a larger sum. Move 'left' pointer to the right.
                        left++;
                    } else { // currentSum > remainingTarget
                        // Current sum is too large, need a smaller sum. Move 'right' pointer to the left.
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
