//You are given an integer array heights representing the current order that the students are standing in.
// Each heights[i] is the height of the ith student in line (0-indexed).
//Return the number of indices where heights[i] != expected[i].

package ASSIGNMENTS.Sorting.Easy;
import java.util.Arrays;

//Approach:
//Copy the original heights array.
//Sort the copied array.
//Compare the original and sorted arrays. For each position where the height is different, increment a counter.
//Return the counter as the answer.

public class Height_Checker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(checker(heights));
    }
    public static int checker(int[] heights){
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != arr[i]){
                ans++;
            }
        }
        return ans;
    }
}
