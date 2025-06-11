package Binary_Search_ALL;

public class Ceiling_BS {
    public static int Ceiling(int[] arr, int target){
//        what if the target is greater than the greatest element in the array
//        then perform this step
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
//            int mid = (start + end) / 2; //might be possible that (start + end) exceeds the range of int in Java
//            hence will not use this
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
//            ans found
            else {
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 6, 10, 15, 18, 20};
        int target = 17;
        System.out.println(Ceiling(arr, target));
    }
}
