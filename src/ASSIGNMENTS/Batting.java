//Calculate Batting Average
package ASSIGNMENTS;
import java.util.Scanner;

public class Batting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total runs scored: ");
        int runs = sc.nextInt();
        System.out.println("Enter number of times out: ");
        int tout = sc.nextInt();
        batting(runs, tout);
    }
    public static void batting(int runs, int tout){
        double avg = (double) runs / tout;
        System.out.println("Batting average is: " +avg);
    }
}
