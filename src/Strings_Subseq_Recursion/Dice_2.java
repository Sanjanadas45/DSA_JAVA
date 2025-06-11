package Strings_Subseq_Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dice_2 {
    public static void main(String[] args) {
        System.out.println(diceRet("", 4));
    }
    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }
}
