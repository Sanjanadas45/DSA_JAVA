//Koko Eating Bananas
//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
//Koko can decide her bananas-per-hour eating speed of k.
// Each hour, she chooses some pile of bananas and eats k bananas from that pile.
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//Return the minimum integer k such that she can eat all the bananas within h hours.

package ASSIGNMENTS.Searching.Medium;
import java.util.Arrays;

//Approach
//Use binary search to minimize K.
//        For each K, check if Koko can finish all bananas in H hours.
//        If she can, try a smaller K.
//        If she can’t, increase K.

public class Koko_EatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        // The lowest possible speed is 1 banana per hour
        int left = 1;
        // The highest possible speed is the largest pile
        int right = Arrays.stream(piles).max().getAsInt();

        // Use binary search to find the minimum feasible eating speed
        while (left < right) {
            // Calculate the middle speed to test
            int mid = left + (right - left) / 2;
            int hours = 0; // Total hours needed at current speed

            // Calculate total hours needed if Koko eats at speed 'mid'
            for (int pile : piles) {
                // Use integer math to simulate ceiling: hours += ceil(pile / mid)
                hours += (pile + mid - 1) / mid;
            }

            // If total hours is more than allowed, speed is too slow, try a faster speed
            if (hours > h) {
                left = mid + 1;
            } else {
                // Otherwise, try a slower (smaller) speed
                right = mid;
            }
        }
        // 'left' is the minimum speed needed
        return left;
    }
}
