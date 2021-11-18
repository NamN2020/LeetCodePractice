import java.util.ArrayList;

public class Solution {
    public static boolean isPalindrome(int x){
        boolean answer = false;
        int number = x;

        ArrayList<Integer> numberArray = new ArrayList<Integer>();

        while(number > 0){
            numberArray.add(number % 10);
            number /= 10;
        }



        return answer;
    }
}
