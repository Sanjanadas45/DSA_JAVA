package Linear_Search_ALL;

public class Search_In_Range {
    public static int searching(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = { 18, 20, 39, 56, 37};
        int target = 39;
        int ans = searching(arr, target, 1, 4);
        System.out.println(ans);
    }
}
