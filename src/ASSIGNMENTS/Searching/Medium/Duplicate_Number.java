//Find Duplicate Number
package ASSIGNMENTS.Searching.Medium;

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(duplicate(nums));
    }
    public static int duplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        // Phase 1: Detect intersection point in the cycle
        do {
            slow = nums[slow];           // Move slow pointer by one step
            fast = nums[nums[fast]];     // Move fast pointer by two steps
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle (the duplicate number)
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];           // Move both pointers by one step
            fast = nums[fast];
        }
        return slow; // The duplicate number
    }
}
