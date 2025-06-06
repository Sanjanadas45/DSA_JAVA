//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package ASSIGNMENTS;

import java.util.Scanner;

public class Sum_TillX {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int sum = 0;
        String n;
        System.out.println("Enter number");
        while(true){
            n = sc.next();
            if(n.equalsIgnoreCase("X")){
                break;
            }
            try {
                //Try to convert input String to an integer
                int number = Integer.parseInt(n);
                sum = sum + number;
                System.out.println("Current Sum: " +sum);
            }
            catch(NumberFormatException e){
                //If input is not a valid number and not 'X', inform user
                System.out.println("Invaid input");
            }
        }
        System.out.println("Final ASSIGNMENTS.Sum: " + sum);
        sc.close(); //close the Scanner
    }
}
