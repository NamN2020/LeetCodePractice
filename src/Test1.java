import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void testIsPalindrome() {
        int inputs[] = {313,111,1234,54345,999,988918, 1211, 38563};

        boolean answers[] = {true, true, false, true, true, false, false, false};

        for(int i = 0; i < inputs.length; i++){
            boolean actual = Solution.isPalindrome(inputs[i]);
            boolean expected = answers[i];

            assertEquals(actual, expected);
        }

    }
}
