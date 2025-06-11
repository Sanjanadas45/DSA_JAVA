//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
package ASSIGNMENTS;
import java.util.Scanner;

public class Count_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 31;
        Days_out(n);
    }
    public static void Days_out(int n){
        int count = 0;
        for (int days = 1; days <= n; days++) {
            if(days % 2 == 0) {
                count ++;
            }
        }
        System.out.println("Kunal can go out on these days: " +count);
    }
}
