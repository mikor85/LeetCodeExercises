package Medium.String_to_Integer_atoi_8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerAtoiTest {

    @Test
    public void testMyAtoi() {

        String inputStr1 = "42";
        assertEquals(42, StringToIntegerAtoi.myAtoi(inputStr1));

        String inputStr2 = "   -42";
        assertEquals(-42, StringToIntegerAtoi.myAtoi(inputStr2));

        String inputStr3 = "4193 with words";
        assertEquals(4193, StringToIntegerAtoi.myAtoi(inputStr3));

        String inputStr4 = "words and 987";
        assertEquals(0, StringToIntegerAtoi.myAtoi(inputStr4));

        String inputStr5 = "-91283472332";
        assertEquals(-2147483648, StringToIntegerAtoi.myAtoi(inputStr5));

        String inputStr6 = "3.14159";
        assertEquals(3, StringToIntegerAtoi.myAtoi(inputStr6));

        String inputStr7 = ".1";
        assertEquals(0, StringToIntegerAtoi.myAtoi(inputStr7));

        String inputStr8 = "+-12";
        assertEquals(0, StringToIntegerAtoi.myAtoi(inputStr8));

        String inputStr9 = "";
        assertEquals(0, StringToIntegerAtoi.myAtoi(inputStr9));

        String inputStr10 = "9223372036854775808";
        assertEquals(2147483647, StringToIntegerAtoi.myAtoi(inputStr10));
    }
}