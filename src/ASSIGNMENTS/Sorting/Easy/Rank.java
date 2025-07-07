//Rank Transform of an Array
//Given an array of integers arr, replace each element with its rank.
//The rank represents how large the element is. The rank has the following rules:
//Rank is an integer starting from 1.
//The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
//Rank should be as small as possible.

//Approach (No HashMap)
//Copy and Sort: Copy the array, sort the copy.
//Assign Ranks: For each unique element in the sorted array, assign it a rank and store these in a parallel array/list (since we can't use HashMap).
//Replace in Original: For each element in the original array, binary search its rank in the sorted array and use its position as the rank.

package ASSIGNMENTS.Sorting.Easy;
import java.util.Arrays;

public class Rank {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0]; // Handle empty input

        // Step 1: Clone and sort the array
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Step 2: Collect unique values into a new array
        int[] unique = new int[n];
        int idx = 0;
        unique[idx++] = sorted[0];
        for (int i = 1; i < n; i++) {
            if (sorted[i] != sorted[i - 1]) {
                unique[idx++] = sorted[i];
            }
        }

        // Step 3: Assign ranks (rank is index + 1 in unique array)
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            // Binary search for arr[i] in unique[0..idx-1]
            int left = 0, right = idx - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (unique[mid] < arr[i]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            result[i] = left + 1; // Ranks are 1-based
        }

        return result;
    }
}
