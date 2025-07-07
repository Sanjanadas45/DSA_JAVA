//Matrix Cells in Distance Order
//You are given four integers row, cols, rCenter, and cCenter. There is a rows x cols matrix and you are on the cell with the coordinates (rCenter, cCenter).
//Return the coordinates of all cells in the matrix, sorted by their distance from (rCenter, cCenter) from the smallest distance to the largest distance.
// You may return the answer in any order that satisfies this condition.
//The distance between two cells (r1, c1) and (r2, c2) is |r1 - r2| + |c1 - c2|.

//Approach: Sort
//1. Loop through all rows. For each row, loop through all columns. Put each row and column coordinate into the output array of length rows * cols.
//2. Sort the result array by distance from the starting cell.
// In the code below, the sort uses a lambda expression, which tells the sort function how to calculate coordinates' distance from the start cell during sorting.

package ASSIGNMENTS.Sorting.Easy;

import java.util.Arrays;

public class Matrix_Cells {
    public static void main(String[] args) {
        int rows = 1, cols = 2, rCenter = 0, cCenter = 0;
        System.out.println(Arrays.deepToString(allCellsDistOrder(rows, cols, rCenter, cCenter)));
    }
    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter){
        int[][] result  = new int[rows * cols][];
        int resultIndex = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[resultIndex++] = new int[]{r, c};
            }
        }
        Arrays.sort(result, (a,b) -> Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter) - Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter));
        return result;
    }
}
