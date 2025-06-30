package ASSIGNMENTS.Searching.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_Smaller {
        // A helper class to store the value and its original index.
        // We need the original index to correctly update the result array.
        private static class Pair {
            int value;
            int index;

            Pair(int value, int index) {
                this.value = value;
                this.index = index;
            }
        }
        // This array will store the final counts for each original index.
        // It's initialized with zeros.
        private int[] result;

        public List<Integer> countSmaller(int[] nums) {
            // Initialize the result array with the same size as the input array.
            result = new int[nums.length];

            // Create an array of Pair objects. Each Pair will hold an original number
            // and its original index.
            Pair[] pairs = new Pair[nums.length];
            for (int i = 0; i < nums.length; i++) {
                pairs[i] = new Pair(nums[i], i);
            }

            // Start the merge sort process on the array of pairs.
            // The core logic for counting smaller elements happens within the merge operation.
            mergeSort(pairs, 0, nums.length - 1);

            // Convert the int array 'result' into a List<Integer> as required by the problem.
            List<Integer> finalResult = new ArrayList<>();
            for (int count : result) {
                finalResult.add(count);
            }
            return finalResult;
        }

        // Standard merge sort recursive function.
        // Divides the array into two halves and recursively sorts them, then merges.
        private void mergeSort(Pair[] pairs, int low, int high) {
            // Base case: if the subarray has 0 or 1 element, it's already "sorted".
            if (low >= high) {
                return;
            }

            int mid = low + (high - low) / 2; // Calculate the middle index.
            mergeSort(pairs, low, mid);       // Recursively sort the left half.
            mergeSort(pairs, mid + 1, high);  // Recursively sort the right half.
            merge(pairs, low, mid, high);     // Merge the two sorted halves.
        }

        // The crucial merge function where the counting happens.
        private void merge(Pair[] pairs, int low, int mid, int high) {
            // Create a temporary array to hold the merged (sorted) elements.
            Pair[] temp = new Pair[high - low + 1];
            int i = low;       // Pointer for the left sorted subarray (from low to mid).
            int j = mid + 1;   // Pointer for the right sorted subarray (from mid+1 to high).
            int k = 0;         // Pointer for the temporary array.

            // This variable counts how many elements from the right subarray
            // have been moved to 'temp' *before* the current element from the left subarray.
            // These are the elements from the right that are smaller than the current left element.
            int rightCount = 0;

            // Iterate through both halves, merging them in a sorted manner.
            while (i <= mid && j <= high) {
                // If the element from the left half is less than or equal to the element from the right half,
                if (pairs[i].value <= pairs[j].value) {
                    // All 'rightCount' elements already processed from the right half are smaller
                    // than the current 'pairs[i].value'.
                    // So, we add 'rightCount' to the result for the original index of 'pairs[i]'.
                    result[pairs[i].index] += rightCount;
                    temp[k++] = pairs[i++]; // Move left element to temp and advance left pointer.
                } else {
                    // If the element from the right half is smaller than the element from the left half,
                    // it means this 'pairs[j].value' is smaller than 'pairs[i].value'.
                    // Increment 'rightCount' because we've found another smaller element from the right.
                    rightCount++;
                    temp[k++] = pairs[j++]; // Move right element to temp and advance right pointer.
                }
            }

            // If there are remaining elements in the left half,
            // they are all larger than all elements processed from the right half.
            // So, all 'rightCount' elements are smaller than these remaining left elements.
            while (i <= mid) {
                result[pairs[i].index] += rightCount;
                temp[k++] = pairs[i++];
            }

            // If there are remaining elements in the right half,
            // they don't contribute to 'smallerCount' for any element already processed from the left half.
            // We just move them to temp to complete the sorted merge.
            while (j <= high) {
                temp[k++] = pairs[j++];
            }

            // Copy the sorted elements from 'temp' back into the original 'pairs' array
            // for this segment (from 'low' to 'high').
            for (int idx = low; idx <= high; idx++) {
                pairs[idx] = temp[idx - low];
            }
        }

        public static void main(String[] args) {
            Count_Smaller solver = new Count_Smaller();
            int[] nums1 = {5, 2, 6, 1};
            System.out.println("Input: " + Arrays.toString(nums1) + ", Output: " + solver.countSmaller(nums1)); // Expected: [2, 1, 1, 0]
        }
}
