//Remove Duplicates from Sorted Array
package ASSIGNMENTS.Arrays.Easy;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int j = 0; // Pointer for the new array without duplicates
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]){
                j ++;
                nums[j] = nums[i];
            }
        }
        return  j + 1; // Length of array without duplicates
    }
}
