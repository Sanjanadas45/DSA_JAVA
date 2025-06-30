//Minimum Cost to Move Chips to The Same Position
package ASSIGNMENTS.Arrays.Easy;

public class Min_cost {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,};
        System.out.println(mincost(arr));
    }
    public static int mincost(int[] position){
        int evencount = 0;
        int oddcount = 0;
        for (int p : position) {
            if(p % 2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        return Math.min(evencount, oddcount);
    }
}
