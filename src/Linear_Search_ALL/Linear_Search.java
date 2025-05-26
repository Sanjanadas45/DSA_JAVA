package Linear_Search_ALL;

public class Linear_Search {
//    search in the array: return the index if item found
//    otherwise if item not found return -1
    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
//        run for loop
        for(int index = 0; index < arr.length; index++){
//            check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
//        this line will execute if none of the return statements above have executed
//        hence the target not found
        return -1;
    }
    public static void main(String[] args){
        int[] nums =  {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 1;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
}
