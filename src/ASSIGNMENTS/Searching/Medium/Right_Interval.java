package ASSIGNMENTS.Searching.Medium;
import java.util.Arrays;

//Approach
//First, sort the intervals based on their start time.
//For each interval, use binary search to find the smallest starting interval that is >= to its end time.
//Map the original interval index to the new sorted index.
//Store the result for each interval.

public class Right_Interval {
    public static void main(String[] args) {
        // Test case: an array with a single interval [1,2]
        int[][] intervals = {{1,2}};
        // Print the result of finding right intervals for the given input
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }

    // Function to find the right interval for each given interval
    public static int[] findRightInterval(final int[][] intervals) {
        // Get the number of intervals
        final int n = intervals.length;
        // Create a new 2D array to store start times along with their original indices
        final int[][] starts = new int[n][2];

        // Populate the 'starts' array: starts[i][0] will be the start time, starts[i][1] will be the original index
        for(int i = 0; i < n; ++i) {
            starts[i][0] = intervals[i][0]; // Store the start time
            starts[i][1] = i; // Store the original index
        }

        // Sort the 'starts' array based on the start times (first element of each inner array)
        Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));

        // Create an array to store the results (the index of the right interval for each original interval)
        final int[] res = new int[n];

        // Iterate through each original interval
        for(int i = 0; i < n; ++i) {
            // Get the end time of the current interval
            final int end = intervals[i][1];
            // Perform binary search on the sorted 'starts' array to find the smallest start time >= current interval's end time
            final int idx = binarySearch(starts, end);

            // If idx == n, it means no right interval was found, so set result to -1
            // Otherwise, set the result to the original index of the found right interval (starts[idx][1])
            res[i] = (idx == n) ? -1 : starts[idx][1];
        }

        // Return the array containing the indices of the right intervals
        return res;
    }

    // Helper function to perform binary search
    // It finds the index of the first element in 'starts' whose start time is greater than or equal to 'target'
    private static int binarySearch(int[][] starts, int target) {
        int left = 0; // Initialize the left pointer for binary search
        int right = starts.length; // Initialize the right pointer (exclusive upper bound)

        // Continue binary search as long as left pointer is less than right pointer
        while(left < right) {
            // Calculate the middle index to avoid potential overflow (left + right) / 2
            final int mid = left + (right - left) / 2;

            // If the start time at mid is greater than or equal to the target,
            // it means we might have found a candidate or need to look in the left half
            if(starts[mid][0] >= target)
                right = mid; // Narrow the search to the left half (including mid)
            else
                // If the start time at mid is less than the target,
                // we need to look in the right half
                left = mid + 1; // Narrow the search to the right half (excluding mid)
        }

        // 'left' will contain the index of the first element whose start time is >= target,
        // or 'starts.length' if no such element is found
        return left;
    }
}