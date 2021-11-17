import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void testIsPalindrome() {
        int inputs[] = {0,313,111,1234,54345,999,988918};

        boolean answers[] = {true, true, true, false, true, true, false};

        for(int i = 0; i < inputs.length; i++){
            boolean actual = Solution.isPalindrome(inputs[i]);
            boolean expected = answers[i];

            assertEquals(actual, expected);
        }

    }
}
