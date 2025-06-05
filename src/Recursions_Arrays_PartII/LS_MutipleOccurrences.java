package Recursions_Arrays_PartII;

import java.util.ArrayList;

public class LS_MutipleOccurrences {
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }
}
