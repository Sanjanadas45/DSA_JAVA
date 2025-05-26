package Arrays;

public class Max_Val {
    public static void main(String[] args){
        int arr[] = {1, 3, 6, 9, 19};
        System.out.println(maxRange(arr, 0, 4));
    }
    //    public static int max(int[] arr){
//        int maxVal = arr[0];
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] > maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
    public static int maxRange(int[] arr, int start, int end){
        if(end < start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
