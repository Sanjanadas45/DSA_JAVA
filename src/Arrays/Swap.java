package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public Swap(int[] arr, int i, int i1) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 6, 8, 9, 10};
        new Swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
