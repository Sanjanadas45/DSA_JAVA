package ASSIGNMENTS.Sorting.Easy;

public class Third_MaxNum {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        // Get the length of the input array.
        int n = nums.length;

        // Initialize three variables to store the first, second, and third maximum values.
        // We use Long.MIN_VALUE to handle cases where numbers might be very small or negative,
        // and to distinguish between a found third maximum and the initial state.
        long max1 = Long.MIN_VALUE; // Stores the largest number found so far.
        long max2 = Long.MIN_VALUE; // Stores the second largest number found so far.
        long max3 = Long.MIN_VALUE; // Stores the third largest number found so far.

        // Iterate through each number in the input array.
        for(int i = 0; i < n; i++){
            // If the current number is greater than max1, it means we found a new largest number.
            if(max1 < nums[i]){
                // Shift the current max1 to max2, and max2 to max3.
                max3 = max2;
                max2 = max1;
                // Update max1 with the new largest number.
                max1 = nums[i];
            }
            // Else if the current number is greater than max2 (but not equal to max1),
            // it means we found a new second largest number.
            else if(max2 < nums[i] && nums[i] != max1){
                // Shift the current max2 to max3.
                max3 = max2;
                // Update max2 with the new second largest number.
                max2 = nums[i];
            }
            // Else if the current number is greater than max3 (but not equal to max1 or max2),
            // it means we found a new third largest number.
            else if(max3 < nums[i] && nums[i] != max2 && nums[i] != max1){
                // Update max3 with the new third largest number.
                max3 = nums[i];
            }
        }

        // After iterating through all numbers, check if a third maximum was actually found.
        // If max3 is still Long.MIN_VALUE, it means there were fewer than three distinct maximums.
        // In this case, the problem requires returning the maximum value (max1).
        // Otherwise, return the found third maximum value (max3).
        return max3 == Long.MIN_VALUE ? (int)max1 : (int)max3;
    }
}
