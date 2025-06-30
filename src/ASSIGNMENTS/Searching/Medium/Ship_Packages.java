//Capacity To Ship Packages Within D Days
//A conveyor belt has packages that must be shipped from one port to another within days days.
//The ith package on the conveyor belt has a weight of weights[i].
// Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

//Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
package ASSIGNMENTS.Searching.Medium;

public class Ship_Packages {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        // Initialize 'start' and 'end' for the binary search range.
        // 'start' represents the minimum possible capacity a ship must have.
        // This minimum capacity is at least the heaviest single package,
        // because the ship must be able to carry even the largest package by itself.
        int start = 0;

        // 'end' represents the maximum possible capacity the ship might need.
        // In the worst-case scenario, the ship might need to carry all packages
        // in a single day. So, the sum of all weights is an upper bound for capacity.
        int end = 0;

        // Calculate the initial 'start' and 'end' values.
        for (int w : weights) {
            // The minimum capacity ('start') must be at least the maximum weight
            // of any individual package.
            start = Math.max(start, w);
            // The maximum capacity ('end') could be the sum of all weights
            // (if all items are shipped in one day).
            end += w;
        }

        // 'ans' will store the minimum capacity found that satisfies the conditions.
        // Initialize it with 'end' (the sum of all weights), as this is a valid
        // but potentially not optimal capacity.
        int ans = end;

        // Perform binary search on the possible range of ship capacities.
        // The search space is [start, end].
        while (start <= end) {
            // Calculate the middle capacity for the current binary search iteration.
            // Using (end - start) / 2 to prevent potential integer overflow
            // compared to (start + end) / 2 if start and end are very large.
            int mid = start + (end - start) / 2;

            // 'requiredDays' will count how many days are needed to ship all packages
            // with the current 'mid' capacity.
            int requiredDays = 1; // Start with 1 day, as we are about to load the first package.
            // 'currentLoad' tracks the total weight loaded on the ship for the current day.
            int currentLoad = 0;

            // Iterate through each package weight to simulate shipping with 'mid' capacity.
            for (int weight : weights) {
                // If adding the current 'weight' exceeds the 'mid' capacity,
                // it means this package must be shipped on a new day.
                if (currentLoad + weight > mid) {
                    requiredDays++; // Increment the day count.
                    currentLoad = weight; // Start a new day with the current package.
                } else {
                    // Otherwise, the current package can fit on the current day's shipment.
                    currentLoad += weight; // Add it to the current load.
                }
            }

            // After simulating shipping all packages, check if the 'requiredDays'
            // are within the allowed 'days' limit.
            if (requiredDays <= days) {
                // If we can ship all packages within 'days' with 'mid' capacity,
                // 'mid' is a possible answer. We try to find an even smaller capacity,
                // so we store 'mid' as a potential answer ('ans') and try the left half.
                ans = mid;
                end = mid - 1; // Search in the lower half of capacities.
            } else {
                // If 'requiredDays' exceed 'days', it means 'mid' capacity is too small.
                // We need a larger capacity, so we search in the upper half.
                start = mid + 1; // Search in the upper half of capacities.
            }
        }

        // 'ans' now holds the minimum ship capacity required to ship all packages
        // within the given number of 'days'.
        return ans;
    }
}
