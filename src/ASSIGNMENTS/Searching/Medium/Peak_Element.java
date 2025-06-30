package ASSIGNMENTS.Searching.Medium;

public class Peak_Element {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}
