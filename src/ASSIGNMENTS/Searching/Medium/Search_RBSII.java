package ASSIGNMENTS.Searching.Medium;

public class Search_RBSII {
    public static void main(String[] args) {
        System.out.println(Search_RBSII.search(new int[]{4,5,6,7,0,1,2}, 0)); // true
        System.out.println(Search_RBSII.search(new int[]{4,5,6,7,0,1,2}, 3)); // false
    }
    public static boolean search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1) != -1;
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1) != -1;
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1) != -1;
    }

    private static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int findPivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) return start;
                start++;
                if (end > start && arr[end] < arr[end - 1]) return end - 1;
                end--;
            }
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
