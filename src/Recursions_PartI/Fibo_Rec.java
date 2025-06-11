package Recursions_PartI;

public class Fibo_Rec {
    public static void main(String[] args){
        System.out.println(f(7));
    }
    public static int f(int n){
//        base condition
        if(n < 2){
            return n;
        }
        return f(n - 1) + f(n - 2);
    }
}
