//Take integer inputs till the user enters 0 and print the sum of all numbers.
package ASSIGNMENTS;
import java.util.Scanner;

public class Sm_Till0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
            if(n == 0){
                break;
            }
            try{
                sum += n;
                System.out.println("Current Sum is: " +sum);
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        System.out.println("Final sum: " +sum);
    }
}
