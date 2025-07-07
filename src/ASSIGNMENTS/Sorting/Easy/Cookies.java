//Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

//Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i],
// we can assign the cookie j to the child i, and the child i will be content.

// Your goal is to maximize the number of your content children and output the maximum number.

package ASSIGNMENTS.Sorting.Easy;

import java.util.Arrays;

public class Cookies {
    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,1};
        System.out.println(cookie(g, s));
    }
    public static int cookie(int[] g, int[] s){
        int m = g.length, n = s.length, i = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i < m && j < n){
            if(s[j] >= g[i]) i++; //Assign cookie to the child
            j++; //Move on to next cookie
        }
        return i;
    }
}
