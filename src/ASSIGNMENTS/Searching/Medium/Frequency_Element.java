//Frequency of the Most Frequent Element
//Option 1: Make all elements 1s
//We have one 1. To make 2 a 1, we need to decrement it by 1 (which isn't allowed, we can only increment).
// So, to make 2 a 4, we need to increment 2 by 2. To make 1 a 4, we need to increment 1 by 3.
//Let's rephrase: if we want to make all elements X, we need to increment smaller elements until they reach X.
//To make [1, 2, 4] all 4s:
//1 needs 4 - 1 = 3 operations.
//2 needs 4 - 2 = 2 operations.
//Total operations = 3 + 2 = 5.
//Since 5 <= k, we can make all elements 4s, and the frequency of 4 becomes 3.
//Option 2: Make all elements 2s
//We have one 2. To make 1 a 2, we need to increment it by 1.
//Total operations = 1.
//Frequency of 2 becomes 2. (We can't make 4 into 2, as we can only increment).

package ASSIGNMENTS.Searching.Medium;
import java.util.Arrays;

//Algorithm Steps:
//1. Sort the nums array.
//2. Initialize left = 0, current_sum = 0, max_frequency = 0.
//3. Iterate right from 0 to n-1:
// a) Add nums[right] to current_sum.
// b) Calculate cost = (long long)nums[right] * (right - left + 1) - current_sum.
// (Use long long for cost to prevent overflow, as nums[right] * (right - left + 1) can be large).
//c) While cost > k:
//   i. Subtract nums[left] from current_sum.
//   ii. Increment left.
//   iii. Recalculate cost = (long long)nums[right] * (right - left + 1) - current_sum.
//   iv. Update max_frequency = max(max_frequency, right - left + 1).
//4. Return max_frequency.

public class Frequency_Element {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }
    public static int maxFrequency(int[] nums, int k) {
        // Step 1: Sort the array. This is crucial because it allows us to
        // consider making elements equal to the largest element in a contiguous subarray.
        Arrays.sort(nums);

        // 'left' pointer for the sliding window
        int left = 0;
        // 'right' pointer for the sliding window
        int right = 0;
        // 'res' stores the maximum frequency found so far. Using long to avoid potential overflow
        // during intermediate calculations before casting to int at the end.
        long res = 0;
        // 'total' keeps track of the sum of elements within the current sliding window.
        // Using long to prevent overflow as array elements and sums can be large.
        long total = 0;

        // Step 2: Iterate with the 'right' pointer to expand the window.
        while (right < nums.length) {
            // Add the current element at 'right' to the total sum of the window.
            total += nums[right];

            // Step 3: Check if the current window is valid (i.e., if we have enough
            // operations 'k' to make all elements in the window equal to nums[right]).
            // The cost to make all elements in the window [left, right] equal to nums[right] is:
            // (nums[right] * window_size) - total_sum_of_window.
            // Here, window_size = (right - left + 1).
            // So, if (nums[right] * (right - left + 1)) > total + k, it means we
            // need more than 'k' operations.
            // Using 1L to ensure the multiplication promotes to long before comparison,
            // preventing potential integer overflow.
            while (nums[right] * (right - left + 1L) > total + k) {
                // If the cost is too high, shrink the window from the 'left'
                // by removing nums[left] from the total sum.
                total -= nums[left];
                // Move the 'left' pointer to the right.
                left += 1;
            }

            // Step 4: After potentially shrinking the window, the current window [left, right]
            // is valid. Update 'res' with the maximum frequency found so far, which is
            // the current window size (right - left + 1).
            // Using 1L to ensure the result of (right - left + 1) is treated as a long
            // before being compared with 'res' (which is long).
            res = Math.max(res, right - left + 1L);

            // Step 5: Move the 'right' pointer to expand the window for the next iteration.
            right += 1;
        }

        // Step 6: Return the maximum frequency found, cast back to int.
        return (int) res;
    }
}
