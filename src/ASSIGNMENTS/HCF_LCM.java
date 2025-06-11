//Take 2 numbers as inputs and find their HCF and LCM.
package ASSIGNMENTS;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp, hcf, lcm;
        //HCF
        while(b != 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        hcf = a;

        //LCM
        lcm = (a * b)/ hcf;

        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
    }
}
