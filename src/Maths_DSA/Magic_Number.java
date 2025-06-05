package Maths_DSA;

public class Magic_Number {
    public static void main(String[] args) {
        int n = 4; //it means that to find the 4th(nth) magic number
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
