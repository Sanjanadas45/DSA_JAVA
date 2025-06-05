package ASSIGNMENTS;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limits: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        //Do this
        armstrong(low, high);
        System.out.println();
        //Instead of this
        //System.out.println(armstrong(low, high)) Because this statement is not taken into account
    }
    static void armstrong(int low, int high){
        for (int i = low; i <= high; i++) {
            int digit, rem, sum = 0;
            digit = i;
            while(digit != 0){
                rem = digit % 10;
                sum = sum + (rem * rem * rem);
                digit = digit / 10;
            }
            if(sum == i){
                System.out.println("Armstrong Numbers are: "+i);
            }
        }
    }
}
