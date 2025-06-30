package ASSIGNMENTS.Arrays.Easy;

public class Matrix_Rotation {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat, target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if(isEqual(mat, target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }
//    // Helper function to check if two matrices are equal
    public static boolean isEqual(int[][] mat1, int[][] mat2){
        int n = mat1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat1[i][j] != mat2[i][j])
                    return false;
            }
        }
        return true;
    }
    // Helper function to rotate the matrix 90 degrees clockwise
    public static int[][] rotate(int[][] mat){
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = mat[i][j];
            }
        }
        return rotated;
    }
}
