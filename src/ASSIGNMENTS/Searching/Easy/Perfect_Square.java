package ASSIGNMENTS.Searching.Easy;
//Use BS

public class Perfect_Square {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(ps(n));
    }
    public static boolean ps(int num){
        int start = 0;
        int end = num;
        while(start < end){
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
            if(square == num) return true;
            else if (square < num)
                start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
