//Special Array With X Elements Greater Than or Equal X
package ASSIGNMENTS.Searching.Easy;

// Try every possible x from 0 to nums.length.
//For each x, count how many elements in nums are greater than or equal to x.
// If the count equals x, return x.
// If no such x is found, return -1.

public class Special_Array {
    public static void main(String[] args) {
        int[] nums = {3, 5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums){
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            int count = 0;
            for(int num : nums){
                if(num >= x){
                    count++;
                }
                if(count == x) return x;
            }
        }
        return -1;
    }
}
