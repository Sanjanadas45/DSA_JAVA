package Strings_Subseq_Recursion;

public class Dice_3 {
    public static void main(String[] args) {
        System.out.println(diceFace("", 4, 7));
    }
    static int diceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return target;
        }
        for (int i = 1; i <= 6 && i <= target ; i++) {
            diceFace(p + i, target - i, face);
        }
        return target;
    }
}
