package Recursions_Arrays_PartII;

public class Find_LS {
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target, index + 1);
        }
    }
    public static int findLastIndex(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findLastIndex(arr, target, index - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findLastIndex(arr, 4, arr.length - 1));
    }
}
