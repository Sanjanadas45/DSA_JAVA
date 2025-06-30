//https://www.spoj.com/problems/AGGRCOW/
package ASSIGNMENTS.Searching.Hard;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    private static boolean canPlaceCows(int[] stalls, int k, int minDistance) {
        // Place the first cow at the first stall.
        int cowsPlaced = 1;
        int lastCowPosition = stalls[0];

        // Iterate through the rest of the stalls to place the remaining cows.
        for (int i = 1; i < stalls.length; i++) {
            // If the current stall is far enough from the last placed cow,
            // place a cow here.
            if (stalls[i] - lastCowPosition >= minDistance) {
                cowsPlaced++;
                lastCowPosition = stalls[i];
            }
            // If we have placed all 'k' cows, we are successful.
            if (cowsPlaced == k) {
                return true;
            }
        }
        // If we iterated through all stalls and couldn't place 'k' cows, return false.
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of stalls
            int c = scanner.nextInt(); // Number of cows

            int[] stalls = new int[n];
            for (int i = 0; i < n; i++) {
                stalls[i] = scanner.nextInt(); // Stall locations
            }

            // Step 1: Sort the stall positions. This is crucial for the greedy check.
            Arrays.sort(stalls);

            // Step 2: Define the search space for the binary search.
            // 'low' can be 0 or 1. If stalls can be identical, 0. If distinct, 1 is fine.
            // Using 0 is generally safer for finding maximum minimum distance.
            int low = 0;
            // 'high' is the maximum possible distance between the two farthest stalls.
            int high = stalls[n - 1] - stalls[0];

            int ans = 0; // This will store the largest minimum distance found.

            // Step 3: Perform binary search on the answer (the minimum distance).
            while (low <= high) {
                int mid = low + (high - low) / 2; // Calculate the middle distance.

                // Check if it's possible to place 'c' cows with 'mid' as the minimum distance.
                if (canPlaceCows(stalls, c, mid)) {
                    // If it's possible, then 'mid' is a valid answer.
                    // We try to find an even larger minimum distance in the right half.
                    ans = mid;
                    low = mid + 1;
                } else {
                    // If it's not possible, then 'mid' is too large.
                    // We need to try a smaller minimum distance in the left half.
                    high = mid - 1;
                }
            }
            System.out.println(ans); // Output the largest minimum distance.
        }

        scanner.close();
    }
}
