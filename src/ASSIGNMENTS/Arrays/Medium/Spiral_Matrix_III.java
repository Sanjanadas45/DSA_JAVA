package ASSIGNMENTS.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral_Matrix_III {
    public static void main(String[] args) {
        int rows = 1, cols = 4, rStart = 0, cStart = 0;
        System.out.println(Arrays.deepToString(spiralMatrixIII(rows, cols, rStart, cStart)));
    }
    public static int[][]  spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] direction = new int[][]{{0,1}, {1, 0}, {0, -1}, {-1, 0}}; // east, south, west, north
        List<int[]> res = new ArrayList<>();
        int len = 0, d = 0; // move <len> steps in the <d> direction
        res.add(new int[]{rStart, cStart});
        while(res.size() < rows * cols){
            if(d == 0 || d == 2) len ++;  // when move east or west, the length of path need plus 1
            for (int i = 0; i < len; i++) {
                rStart += direction[d][0];
                cStart += direction[d][1];
                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) // check valid
                    res.add(new int[] {rStart, cStart});
            }
            d = (d + 1) % 4; // turn to next direction
        }
        return res.toArray(new int[rows * cols][2]);
    }
}
