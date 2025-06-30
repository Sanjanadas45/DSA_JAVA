//Flipping an Image
package ASSIGNMENTS.Arrays.Easy;
import java.util.Arrays;

public class Image_Flipping {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flip(image)));
    }
    public static int[][] flip(int[][] image){
        int n = image.length; // Get the dimension of the square image (number of rows/columns).

        for (int i = 0; i < n; i++) { // Iterate through each row of the image.

            for (int j = 0; j < n / 2; j++) { // Iterate through the first half of the columns in the current row.

                int t = image[i][j]; // Store the current pixel's value in a temporary variable.

                image[i][j] = image[i][n - j - 1] ^ 1; // Swap the current pixel with its horizontally opposite pixel and invert its value.

                image[i][n - j - 1] = t ^ 1; // Assign the original (inverted) pixel value to the horizontally opposite pixel.
            }
            if(n % 2 != 0){ // Check if the image has an odd number of columns.
                image[i][n / 2] = image[i][n / 2] ^ 1; // If odd, invert the value of the middle pixel in the current row.
            }
        }
        return image; // Return the modified image (horizontally flipped and inverted).
    }
//    ^ 1 performs a bitwise XOR operation with 1.
//    If the pixel value is 0, 0 ^ 1 results in 1.
//    If the pixel value is 1, 1 ^ 1 results in 0.
}
