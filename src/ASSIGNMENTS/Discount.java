//Calculate Discount Of Product
package ASSIGNMENTS;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marked price and selling price: ");
        int mp = sc.nextInt();
        int sp = sc.nextInt();
        discount(mp, sp);
    }
    public static void discount(int mp, int sp){
        int dis = mp - sp;
        System.out.println("Discount of the product is: " +dis);
    }
}
