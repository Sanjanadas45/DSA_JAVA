package Recursions_PartI;

public class Printing {
    public static void funBoth(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        funBoth(5);
    }
}
