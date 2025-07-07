package ASSIGNMENTS.Sorting.Easy;

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(mismatch(arr)));
    }
    public static int[] mismatch(int[] nums){
        int[] count = new int[nums.length - 1];
        int dup = -1, missing = -1;
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        for(int i = 1; i <= nums.length; i++){
            if(count[i] == 0) dup = i;
            else if (count[i] == 2) {
                missing = i;
            }
        }
        return new int[] {dup, missing};
    }
}
