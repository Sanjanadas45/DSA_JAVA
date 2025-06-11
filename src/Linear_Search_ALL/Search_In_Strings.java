package Linear_Search_ALL;

import java.util.Arrays;

public class Search_In_Strings {
    public static boolean Search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
//    public static boolean search2(String str, char target){
//        if(str.length() == 0){
//            return false;
//        }
//        for(char ch:str.toCharArray()){
//            if(ch == target){
//                return true;
//            }
//        }
//        return false;
//    }
    public static void main(String[] args){
        String name = "Sanjana";
        char target = 'o';
        System.out.println(Search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
