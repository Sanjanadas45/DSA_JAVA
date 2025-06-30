package ASSIGNMENTS.Searching.Easy;

public class Arranging_Coins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ac(n));
    }
    public static int ac(int n){
        long start = 0;
        long end = n;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long ans = mid * (mid + 1) / 2;
            if(ans == mid) return (int) mid;
            else if (mid < n) {
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return (int) end;
    }
}
