//Calculate Electricity Bill
package ASSIGNMENTS;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units: ");
        int units = sc.nextInt();
//        System.out.println("Enter rate per unit: ");
//        float rate = sc.nextFloat();
//        EC1(units, rate);
        EC2(units);
    }
//    without slabs
    public static void EC1(int units, float rate){
        double bill = units * rate;
        System.out.println("Total electricity bill is: " +bill);
    }
//    with slabs
//    First 100 units: ₹5/unit
//    Next 100 units: ₹7/unit
//    Above 200 units: ₹10/unit
    public static void EC2(int units){
        if(units <= 100){
            double bill = units * 5;
            System.out.println("Total electricity bill is: " +bill);
        } else if (units >= 100) {
            double bill = 100 * 5 + (units - 100) * 7;
            System.out.println("Total electricity bill is: " +bill);
        }
        else {
            double bill = 100 * 5 + 100 * 7 + (units - 200) * 10;
            System.out.println("Total electricity bill is: " +bill);
        }
    }
}
