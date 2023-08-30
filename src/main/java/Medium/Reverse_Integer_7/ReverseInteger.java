package Medium.Reverse_Integer_7;

/*
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Example 3:
 * Input: x = 120
 * Output: 21
 *
 * Constraints:
 *     -2^31 <= x <= 2^31 - 1
 *     -2147483648 <= x <= 2147483647
 *
 * */

public class ReverseInteger {

    public static void main(String[] args) {
        int x = -2147483648;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {

        StringBuilder result = new StringBuilder();
        long inputNumberLong = x;

        if (inputNumberLong < 0) {
            result.append("-");
            inputNumberLong *= -1;
        }

        StringBuilder inputNumberStr = new StringBuilder(String.valueOf(inputNumberLong)).reverse();
        result.append(inputNumberStr);
        long resultInt = Long.parseLong(result.toString());

        if (resultInt >= Math.pow(-2, 31) && resultInt <= Math.pow(2, 31) - 1) {
            return (int) resultInt;
        }

        return 0;
    }
}