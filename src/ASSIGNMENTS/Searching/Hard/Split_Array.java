//Split Array Largest Sum
package ASSIGNMENTS.Searching.Hard;

public class Split_Array {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
    public static int splitArray(int[] nums, int k) {
        // Initialize 'start' and 'end' for the binary search range.
        // The 'start' of our search space for the minimum possible largest sum:
        // The minimum possible largest sum is at least the maximum single element in the array.
        // (Because even if we split the array into as many pieces as possible,
        // the largest sum will be at least the largest individual number).
        int start = 0;

        // The 'end' of our search space for the minimum possible largest sum:
        // The maximum possible largest sum is the sum of all elements in the array.
        // (This happens if we don't split the array at all, i.e., k=1).
        int end = 0;

        // Calculate the initial 'start' and 'end' values.
        for (int num : nums) {
            // 'start' becomes the maximum individual number in the array.
            start = Math.max(start, num);
            // 'end' becomes the total sum of all numbers in the array.
            end += num;
        }

        // Perform binary search on the possible range of the "largest sum".
        // We are searching for the smallest possible 'mid' value (which represents the maximum subarray sum).
        while (start <= end) {
            // Calculate the middle value, which is our current guess for the "largest sum".
            int mid = start + (end - start) / 2;

            // 'pieces' will count how many subarrays we can split the array into
            // if no subarray sum exceeds 'mid'.
            int pieces = 1;

            // 'currentSum' keeps track of the sum of the current subarray being formed.
            int currentSum = 0;

            // Iterate through the numbers to try and split the array
            // based on our current 'mid' (maximum allowed subarray sum).
            for (int num : nums) {
                // If adding the current number 'num' to 'currentSum' exceeds our allowed 'mid',
                // it means we must start a new subarray.
                if (currentSum + num > mid) {
                    pieces++; // Increment the number of pieces (subarrays).
                    currentSum = num; // Start a new subarray with the current number.
                } else {
                    // Otherwise, add the current number to the current subarray.
                    currentSum += num;
                }
            }

            // After attempting to split the array with 'mid' as the maximum sum:
            // If the number of 'pieces' we formed is less than or equal to 'k' (the allowed number of splits),
            // it means 'mid' is a *possible* maximum sum, and it might be too large.
            // We try to find a smaller 'mid' in the left half of our search space.
            if (pieces <= k) {
                end = mid - 1; // Try a smaller maximum sum.
            } else {
                // If the number of 'pieces' we formed is greater than 'k',
                // it means 'mid' is too small to split the array into 'k' pieces.
                // We need a larger maximum sum, so we search in the right half.
                start = mid + 1; // Try a larger maximum sum.
            }
        }
        // When the loop finishes (start > end), 'start' will hold the smallest 'mid'
        // that allowed us to split the array into 'k' or fewer pieces.
        // This 'start' value is the minimum possible largest sum.
        return start;
    }
}
