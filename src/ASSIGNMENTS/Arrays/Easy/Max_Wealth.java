//Richest Customer Wealth
package ASSIGNMENTS.Arrays.Easy;

import java.util.Scanner;

public class Max_Wealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
