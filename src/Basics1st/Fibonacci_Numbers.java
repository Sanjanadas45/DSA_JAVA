package Basics1st;

import java.util.Scanner;

public class Fibonacci_Numbers {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1; //current index
    int p = 0; //previous index
    int count = 2;
    while(count <= n)
    {
        int temp = i;
        i = i + p;
        p = temp;
        count++;
    }
    System.out.println(i);
    }
}
