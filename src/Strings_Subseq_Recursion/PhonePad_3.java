package Strings_Subseq_Recursion;

import java.util.ArrayList;

public class PhonePad_3 {
    public static void main(String[] args) {
        System.out.println(PadRet("", "12").size());
        System.out.println(PadCount("", "12"));
    }
    static ArrayList<String> PadRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; //this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(PadRet(p + ch, up.substring(1)));
        }
        return list;
    }
    static int PadCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; //this will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            count = count + PadCount(p + ch, up.substring(1));
        }
        return count;
    }
}
