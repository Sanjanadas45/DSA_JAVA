//Future Investment Value
package ASSIGNMENTS;

import java.util.Scanner;

public class Future_Investment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int p = sc.nextInt();
        System.out.println("Enter rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter years: ");
        int y = sc.nextInt();
        FI(p, r, y);
    }
    public static void FI(int p, float r, int y){
        double fi = p * (Math.pow(1 + r, y));
        System.out.println("Future Investment Value is: " +fi);
    }
}
