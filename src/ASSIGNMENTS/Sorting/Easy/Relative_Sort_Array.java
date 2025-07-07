//Relative Sort Array

//Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
//Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
// Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

//Approach:
//1. Count the frequency of each element in arr1 using a counting array (this works well if you know the range of input values, e.g., values are not too large or negative).
//2. Iterate through arr2, and for each value, place that many occurrences into the result array.
//3. Iterate through the rest of the counting array (for values not in arr2), and append any remaining numbers in sorted order.

package ASSIGNMENTS.Sorting.Easy;
import java.util.Arrays;

public class Relative_Sort_Array {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        // Test the function and print the sorted array
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: Find the maximum value in arr1 to determine the size of the count array
        int max = 0;
        for (int num : arr1) {
            if (num > max) max = num;
        }

        // Step 2: Create and populate the count array to store frequency of each number in arr1
        int[] count = new int[max + 1];
        for (int num : arr1) {
            count[num]++;
        }

        // Step 3: Prepare the result array and a pointer for its index
        int[] result = new int[arr1.length];
        int idx = 0;

        // Step 4: Place elements found in arr2 into result, following the order in arr2
        for (int num : arr2) {
            while (count[num] > 0) {
                result[idx++] = num;
                count[num]--;
            }
        }

        // Step 5: Place remaining elements not in arr2 into result, in ascending order
        for (int num = 0; num <= max; num++) {
            while (count[num] > 0) {
                result[idx++] = num;
                count[num]--;
            }
        }

        // Step 6: Return the sorted result array
        return result;
    }
}
