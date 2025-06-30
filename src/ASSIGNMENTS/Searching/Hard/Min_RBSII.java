package ASSIGNMENTS.Searching.Hard;

public class Min_RBSII {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums){
        int start = 0, end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[end]) end = mid;
            else if(nums[mid] > nums[start]) start = mid + 1;
            else end --;
        }
        return nums[start];
    }
}
