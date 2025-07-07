//Minimum Absolute Difference
//Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
//Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
//a, b are from arr
//a < b
//b - a equals to the minimum absolute difference of any two elements in arr

package ASSIGNMENTS.Sorting.Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Min_Diff {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        // 1. Sort the array. Like putting the numbers in order from smallest to largest.
        Arrays.sort(arr);

        // 2. Initialize the minimum difference to the largest possible value. Think of it like this:
        //    We're starting with a really high bar, and we'll try to find a difference that's even lower.
        int minDiff = Integer.MAX_VALUE;

        // 3. Create an empty list to store the pairs of numbers with the minimum difference.
        List<List<Integer>> res = new ArrayList<>();

        // 4. Iterate through the sorted array, comparing each number with its neighbor.
        for (int i = 0; i < arr.length - 1; i++) {
            // 5. Calculate the absolute difference between the current number and the next number.
            int currDiff = Math.abs(arr[i] - arr[i + 1]);

            // 6. If the current difference is smaller than the minimum difference found so far:
            if (currDiff < minDiff) {
                // a. Update the minimum difference.
                minDiff = currDiff;
                // b. Clear the result list because we've found a new minimum difference, and the old pairs are no longer valid.
                res.clear();
                // c. Add the current pair of numbers to the result list.
                addPairToRes(arr[i], arr[i + 1], res);
            }
            // 7. If the current difference is equal to the minimum difference:
            else if (currDiff == minDiff) {
                // a. Add the current pair of numbers to the result list.
                addPairToRes(arr[i], arr[i + 1], res);
            }
        }

        // 8. Return the list of pairs with the minimum absolute difference.
        return res;
    }

    // Helper method to add a pair of numbers to the result list. Keeps the main method clean.
    private static void addPairToRes(int num1, int num2, List<List<Integer>> res) {
        List<Integer> pair = Arrays.asList(num1, num2);
        res.add(pair);
    }
}
