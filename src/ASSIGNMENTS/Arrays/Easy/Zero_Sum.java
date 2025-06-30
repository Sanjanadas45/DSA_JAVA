//Find N Unique Integers Sum up to Zero
package ASSIGNMENTS.Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Zero_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        // Add pairs (i, -i)
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // If n is odd, add 0
        if (n % 2 == 1) {
            result[index++] = 0;
        }

        return result;
    }
}
