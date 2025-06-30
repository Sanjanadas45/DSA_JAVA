//Problem Recap
//Given a 2D matrix, a peak element is one that is strictly greater than its four neighbors (up, down, left, right).
// You must find any one peak and return its position.

package ASSIGNMENTS.Searching.Medium;

//Approach: Binary Search on Columns (Efficient)
//Initialize two pointers for columns: left = 0, right = n-1 (where n is the number of columns).
//While left <= right:
//Find the middle column mid = (left + right) / 2.
//Find the row maxRow with the maximum value in this column.
//Check neighbors (left and right columns) of matrix[maxRow][mid]:
//If it’s greater than both neighbors (or at the edge), you found a peak.
//If the left neighbor is greater, search left half (right = mid - 1).
//If the right neighbor is greater, search right half (left = mid + 1).

import java.util.Arrays;

public class Peak_ElementII {
    public static void main(String[] args) {
        int[][] mat = {{1,4},{3,2}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int left = 0, right = cols - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;
            // Find the row index of the max element in midCol
            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }
            // Check neighbors
            boolean leftIsBigger = midCol - 1 >= 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol];
            boolean rightIsBigger = midCol + 1 < cols && mat[maxRow][midCol + 1] > mat[maxRow][midCol];

            if (!leftIsBigger && !rightIsBigger) {
                // Peak found
                return new int[]{maxRow, midCol};
            } else if (leftIsBigger) {
                right = midCol - 1;
            } else { // rightIsBigger
                left = midCol + 1;
            }
        }
        return new int[]{-1, -1}; // Should not reach here
    }
}
