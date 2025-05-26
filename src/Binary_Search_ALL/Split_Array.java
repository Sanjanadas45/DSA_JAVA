package Binary_Search_ALL;

public class Split_Array {
    public static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); //in the end of the loop this will contain the max item of the array
            end += nums[i];
        }
//        binary search
        while(start <= end){
            int mid = start + (end - start) / 2; //try for the middle as potential ans
//            calculate how many pieces we can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
//                    we cannot add this in this subarray, so make a new one
//                    say we add this num in new subarray, then sum = num
                    sum = num;
                    pieces ++;
                }
                else {
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end; //here start == end
    }
    public static void main(String[] args){
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }
}
