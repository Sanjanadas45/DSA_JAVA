package Binary_Search_ALL;

public class Infinite_Array { //Amazon Interview Question
    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 3;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 7, 8, 9, 10, 22, 90, 100, 190, 200, 290};
        int target = 22;
        System.out.println(ans(arr, target));
    }
}
