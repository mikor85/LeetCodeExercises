package Medium.String_to_Integer_atoi_8;

/*
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * The algorithm for myAtoi(string s) is as follows:
 *     1. Read in and ignore any leading whitespace.
 *     2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 *     3. Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 *     4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 *     5. If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 *     6. Return the integer as the final result.
 *
 * Note:
 *     Only the space character ' ' is considered a whitespace character.
 *     Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 *
 * Example 1:
 * Input: s = "42"
 * Output: 42
 * Explanation: The underlined characters are what is read in, the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "42" ("42" is read in)
 *            ^
 * The parsed integer is 42.
 * Since 42 is in the range [-2^31, 2^31 - 1], the final result is 42.
 *
 * Example 2:
 * Input: s = "   -42"
 * Output: -42
 * Explanation:
 * Step 1: "   -42" (leading whitespace is read and ignored)
 *             ^
 * Step 2: "   -42" ('-' is read, so the result should be negative)
 *              ^
 * Step 3: "   -42" ("42" is read in)
 *                ^
 * The parsed integer is -42.
 * Since -42 is in the range [-2^31, 2^31 - 1], the final result is -42.
 *
 * Example 3:
 * Input: s = "4193 with words"
 * Output: 4193
 * Explanation:
 * Step 1: "4193 with words" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
 *              ^
 * The parsed integer is 4193.
 * Since 4193 is in the range [-2^31, 2^31 - 1], the final result is 4193.
 *
 * Constraints:
 *     0 <= s.length <= 200
 *     s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 *
 * */

import java.math.BigInteger;

public class StringToIntegerAtoi {

    public static void main(String[] args) {

        String inputStr2 = "   -42";
        System.out.println(myAtoi(inputStr2));
    }

    public static int myAtoi(String s) {

        // Remove spaces
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        // Check for the sign
        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        // Read all digits
        double num = 0;
        int i = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');  // (s.charAt(i) - '0') is converting character to integer
            i++;
        }

        // Change the sign of number
        num = num * sign;

        // Check for the range of Integer
        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) num;
    }

    public static int myAtoiBigInteger(String s) {

        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        BigInteger num = new BigInteger(String.valueOf(0));
        int i = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(Long.parseLong(String.valueOf(s.charAt(i)))));
            i++;
        }

        num = num.multiply(BigInteger.valueOf(sign));

        if (num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        } else if (num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        }

        return num.intValue();
    }
}