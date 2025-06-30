package ASSIGNMENTS.Searching.Easy;
import java.util.Arrays;
public class Fair_CandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1}, bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
            else return mid;
        }
        return -1;
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sumB += bobSizes[i];
        }
        int diff = (sumA - sumB)/2; // This is the amount Alice needs to lose, and Bob needs to gain
        Arrays.sort(aliceSizes); // For binary search

        for (int b : bobSizes) {
            int a = b + diff;
            if (binarySearch(aliceSizes, a) != -1) {
                return new int[]{a, b};
            }
        }
        return null;
    }
}
