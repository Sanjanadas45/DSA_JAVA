//Maximum Product of Two Elements in an Array
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

package ASSIGNMENTS.Sorting.Easy;

public class Maximum_Prod {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(prod(nums));
    }
    public static int prod(int[] nums){
        int max1 = 0, max2 = 0;
        for(int i : nums){
            if(i > max1){
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
