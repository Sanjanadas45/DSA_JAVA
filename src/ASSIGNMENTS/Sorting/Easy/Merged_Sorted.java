//Merge Sorted Array
package ASSIGNMENTS.Sorting.Easy;

import java.util.Arrays;

public class Merged_Sorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // Pointer to the last valid element in nums1
        int j = n - 1;        // Pointer to the last element in nums2
        int k = m + n - 1;    // Pointer to the last position in nums1

        // Merge nums2 into nums1 starting from the end
        while (j >= 0) { // Continue until all elements in nums2 are merged
            // If nums1 still has elements and current element in nums1 is greater than nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // Place nums1[i] at the end and move pointers
            } else {
                nums1[k--] = nums2[j--]; // Place nums2[j] at the end and move pointers
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
