package Cyclic_Sort_ALL;

public class Duplicate_Number {
    public static int duplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }
                else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 4, 5};
        System.out.println(duplicate(arr));
    }
}
