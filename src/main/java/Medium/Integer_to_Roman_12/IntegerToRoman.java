package Medium.Integer_to_Roman_12;

/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 *
 * There are six instances where subtraction is used:
 *     I can be placed before V (5) and X (10) to make 4 and 9.
 *     X can be placed before L (50) and C (100) to make 40 and 90.
 *     C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given an integer, convert it to a roman numeral.
 *
 * Example 1:
 * Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.
 *
 * Example 2:
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 *
 * Example 3:
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * Constraints:
 *     1 <= num <= 3999
 *
 * */

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    // Map
    public static String intToRoman(int num) {

        Map<Integer, String> intToRomMap = new HashMap<>();
        intToRomMap.put(1, "I");
        intToRomMap.put(2, "II");
        intToRomMap.put(3, "III");
        intToRomMap.put(4, "IV");
        intToRomMap.put(5, "V");
        intToRomMap.put(6, "VI");
        intToRomMap.put(7, "VII");
        intToRomMap.put(8, "VIII");
        intToRomMap.put(9, "IX");
        intToRomMap.put(10, "X");
        intToRomMap.put(20, "XX");
        intToRomMap.put(30, "XXX");
        intToRomMap.put(40, "XL");
        intToRomMap.put(50, "L");
        intToRomMap.put(60, "LX");
        intToRomMap.put(70, "LXX");
        intToRomMap.put(80, "LXXX");
        intToRomMap.put(90, "XC");
        intToRomMap.put(100, "C");
        intToRomMap.put(200, "CC");
        intToRomMap.put(300, "CCC");
        intToRomMap.put(400, "CD");
        intToRomMap.put(500, "D");
        intToRomMap.put(600, "DC");
        intToRomMap.put(700, "DCC");
        intToRomMap.put(800, "DCCC");
        intToRomMap.put(900, "CM");
        intToRomMap.put(1000, "M");
        intToRomMap.put(2000, "MM");
        intToRomMap.put(3000, "MMM");

        StringBuilder romanNumber = new StringBuilder();
        int divider = 10;
        while (num != 0) {
            int remainder = num % divider;
            if (remainder == 0) {
                divider *= 10;
                continue;
            }
            StringBuilder stringToAppend = new StringBuilder(intToRomMap.get(remainder)).reverse();
            romanNumber.append(stringToAppend);
            divider *= 10;
            num -= remainder;
        }
        return romanNumber.reverse().toString();
    }

    // Array and String
    public static String intToRomanArray(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}