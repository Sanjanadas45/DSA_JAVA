//Kids With the Greatest Number of Candies
package ASSIGNMENTS.Arrays.Easy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greatest_Candies {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] candies = {12, 1, 12};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int candy : candies){ //It iterates over each element in the candies array.On each iteration,
            // the variable candy holds the value of the current element (not the index)
            if(candy > max) max = candy;
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
