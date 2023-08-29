package Easy.Roman_to_Integer_13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt() {

        // Test 1
        String s1 = "III";
        int result1 = RomanToInteger.romanToInt(s1);
        assertEquals(3, result1);

        int result11 = RomanToInteger.romanToIntVersion2(s1);
        assertEquals(3, result11);

        // Test 2
        String s2 = "LVIII";
        int result2 = RomanToInteger.romanToInt(s2);
        assertEquals(58, result2);

        int result21 = RomanToInteger.romanToIntVersion2(s2);
        assertEquals(58, result21);

        // Test 3
        String s3 = "MCMXCIV";
        int result3 = RomanToInteger.romanToInt(s3);
        assertEquals(1994, result3);

        int result31 = RomanToInteger.romanToIntVersion2(s3);
        assertEquals(1994, result31);
    }
}