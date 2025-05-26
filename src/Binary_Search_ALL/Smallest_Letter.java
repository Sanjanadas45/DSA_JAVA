package Binary_Search_ALL;

public class Smallest_Letter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (target < mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args){
        char[] arr = { 'c', 'd', 'f', 'j'};
        char target = 'j';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }
}
