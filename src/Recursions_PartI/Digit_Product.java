package Recursions_PartI;

public class Digit_Product {
    public static int prod(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * prod(n / 10);
    }

    public static void main(String[] args) {
        int ans = prod(1324);
        System.out.println(ans);
    }
}
