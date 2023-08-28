package Easy.Palindrome_Number_9;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome() {

        int x = 121;
        assertTrue(PalindromeNumber.isPalindrome(x));

        int x1 = -121;
        assertFalse(PalindromeNumber.isPalindrome(x1));

        int x2 = 10;
        assertFalse(PalindromeNumber.isPalindrome(x2));
    }
}