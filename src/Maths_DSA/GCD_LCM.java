package Maths_DSA;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4, 9));
        System.out.println(lcm(2, 7));
    }
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a, a);
    }
    public static int lcm(int a, int b){
        return a * b/ gcd(a, b);
    }
}
