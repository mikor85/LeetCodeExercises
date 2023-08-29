package Easy.Roman_to_Integer_13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt() {

        RomanToInteger romanToInteger = new RomanToInteger();

        // Test 1
        String s1 = "III";
        int result1 = romanToInteger.romanToInt(s1);
        assertEquals(3, result1);

        // Test 2
        String s2 = "LVIII";
        int result2 = romanToInteger.romanToInt(s2);
        assertEquals(58, result2);

        // Test 3
        String s3 = "MCMXCIV";
        int result3 = romanToInteger.romanToInt(s3);
        assertEquals(1994, result3);
    }
}