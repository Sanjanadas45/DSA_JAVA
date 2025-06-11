//Calculate Commission Percentage
package ASSIGNMENTS;
import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the commission: ");
        int cp = sc.nextInt();
        System.out.println("Enter the sales amount: ");
        int sa = sc.nextInt();
        commission_percentage(cp, sa);
    }
    public static void commission_percentage(int commission, int sales){
//        The formula is: Commission = (Sales Amount × Commission Percentage) / 100
        double c_p = ((double) commission / sales) * 100;
        System.out.println("Commission Percenatge is: " +c_p);
    }
}
