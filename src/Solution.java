import java.util.ArrayList;

public class Solution {
    public static boolean isPalindrome(int x){
        boolean answer;
        int number = x;
        int matchingDigits = 0;
        int expectedMatch;

        ArrayList<Integer> numberArray = new ArrayList<Integer>();

        // adding last digit of number to array than dividing by 10 to get 2nd to last digit and so on
        while(number > 0){
            numberArray.add(number % 10);
            number /= 10;
        }

        if(numberArray.size() % 2 == 1){
            int center = numberArray.size()/2;
            numberArray.remove(center);
        }

        expectedMatch = numberArray.size()/2;

        int i = 0;
        int j = numberArray.size() - 1;

        while(i < j){
            if(numberArray.get(i) == numberArray.get(j)){
                matchingDigits += 1;
            }
            i++;
            j--;
        }

        if (matchingDigits == expectedMatch){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
