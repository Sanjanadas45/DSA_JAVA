package Maths_DSA;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    public static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n / x));
            if(Math.abs(root- x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
