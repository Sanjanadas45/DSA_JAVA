//Given a m x n matrix grid which is sorted in non-increasing order
// both row-wise and column-wise, return the number of negative numbers in grid.
package ASSIGNMENTS.Searching.Easy;

public class Count_Negatives {
    public static void main(String[] args) {
        int[][] grid = {{3,2},{1,0}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid){
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if(grid[i][j] < 0){
                    count ++;
                    continue;
                }
                break;
            }
        }
        return count;
    }
}
