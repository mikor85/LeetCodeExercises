package Medium.Integer_to_Roman_12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testIntToRoman() {

        int num1 = 3;
        assertEquals("III", IntegerToRoman.intToRoman(num1));
        assertEquals("III", IntegerToRoman.intToRomanArray(num1));

        int num2 = 58;
        assertEquals("LVIII", IntegerToRoman.intToRoman(num2));
        assertEquals("LVIII", IntegerToRoman.intToRomanArray(num2));

        int num3 = 1994;
        assertEquals("MCMXCIV", IntegerToRoman.intToRoman(num3));
        assertEquals("MCMXCIV", IntegerToRoman.intToRomanArray(num3));

        int num4 = 10;
        assertEquals("X", IntegerToRoman.intToRoman(num4));
        assertEquals("X", IntegerToRoman.intToRomanArray(num4));

    }
}