//Minimum Absolute Sum Difference
//You are given two positive integer arrays nums1 and nums2, both of length n.
//The absolute sum difference of arrays nums1 and nums2 is defined as the sum of |nums1[i] - nums2[i]| for each 0 <= i < n (0-indexed).
//You can replace at most one element of nums1 with any other element in nums1 to minimize the absolute sum difference.
//Return the minimum absolute sum difference after replacing at most one element in the array nums1. Since the answer may be large, return it modulo 109 + 7.
//|x| is defined as:
//x if x >= 0, or
//-x if x < 0.

package ASSIGNMENTS.Searching.Medium;
import java.util.Arrays;

//Approach
//We use a sorted copy of nums1 to efficiently find the best replacement for each index using binary search.
//For each index, we calculate the current absolute difference and see if replacing nums1[i] with a value closest to nums2[i] (from nums1) reduces the difference.
//We keep track of the maximum reduction ("gain") and subtract it from the original total.

public class Min_SumDiff {
    public static void main(String[] args) {
        int[] nums1 = {1,7,5}, nums2 = {2,3,5};
        System.out.println(minAbsoluteSumDiff(nums1, nums2));
    }
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int MOD = 1_000_000_007;

        // Make a sorted copy of nums1 for binary search
        int[] sorted = nums1.clone();
        Arrays.sort(sorted);

        int total = 0;    // The original sum
        int maxGain = 0;  // The best improvement found

        for (int i = 0; i < n; i++) {
            int a = nums1[i];
            int b = nums2[i];
            int diff = Math.abs(a - b);
            total = (total + diff) % MOD;

            // Binary search for the value in sorted closest to nums2[i]
            int idx = Arrays.binarySearch(sorted, b);
            if (idx < 0) idx = -idx - 1;

            // Check the closest value on the right (if exists)
            if (idx < n) {
                int candidateDiff = Math.abs(sorted[idx] - b);
                maxGain = Math.max(maxGain, diff - candidateDiff);
            }
            // Check the closest value on the left (if exists)
            if (idx > 0) {
                int candidateDiff = Math.abs(sorted[idx - 1] - b);
                maxGain = Math.max(maxGain, diff - candidateDiff);
            }
        }

        // Subtract the best improvement from total
        return (total - maxGain + MOD) % MOD;
    }
}
