//Input a year and find whether it is a leap year or not.
package ASSIGNMENTS;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int y = sc.nextInt();
        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }
}
