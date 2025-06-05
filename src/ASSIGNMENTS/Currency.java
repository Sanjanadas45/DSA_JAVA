package ASSIGNMENTS;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupees: ");
        double amt = sc.nextInt();
        if(amt == 1){
            amt = 0.012;
        }
        else{
            amt = amt * 0.012;
        }
        System.out.println("USD amt: " +amt);
    }
}
