package Linear_Search_ALL;

public class Even_Num_Of_Digits {
    public static int digits(int num){
//        For -ve numbers
        if(num < 0){
            num = num * - 1;
        }
        if(num == 0){
            return 1;
        }
//        count number of digits in a number
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    public static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
//        findNumbers function is used to find the even number of digits in a number.
//        Hence here it is 2 in output as in the array:12 and 7890 has even number of digits
        int[] nums = {12, 345, 2, 6, 7890};
        System.out.println(findNumbers(nums));
        System.out.println(digits(-543678));
    }
}
