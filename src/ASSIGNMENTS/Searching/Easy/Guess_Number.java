//We are playing the Guess Game. The game is as follows:
//
//I pick a number from 1 to n. You have to guess which number I picked.
//
//Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
//Hint- use binary search here.
package ASSIGNMENTS.Searching.Easy;

public class Guess_Number {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(gn(n));
    }
    public static int gn(int n){
        int start = 0;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid == -1){
                end = mid - 1;
            } else if (mid == 1) {
                end = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
