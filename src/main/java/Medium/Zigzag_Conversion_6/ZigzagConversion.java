package Medium.Zigzag_Conversion_6;

/*
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 *
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * Example 3:
 * Input: s = "A", numRows = 1
 * Output: "A"
 *
 * Constraints:
 *     1 <= s.length <= 1000
 *     s consists of English letters (lower-case and upper-case), ',' and '.'.
 *     1 <= numRows <= 1000
 *
 * */

public class ZigzagConversion {

    public static void main(String[] args) {

        String s1 = "AB";
        System.out.println(convert(s1, 1));
    }

    public static String convert(String s, int numRows) {

        StringBuilder[] strings = new StringBuilder[numRows];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new StringBuilder();
        }

        int i = 0;
        int lineIndex = 0;

        int indexFlowDirection = 1;
        while (i < s.length()) {

            char current = s.charAt(i);
            strings[lineIndex].append(current);

            if (indexFlowDirection == 1 && strings.length > 1) {
                lineIndex++;
                if (lineIndex == numRows - 1) {
                    indexFlowDirection = 0;
                    i++;
                    continue;
                }
            }
            if (lineIndex > 0 && indexFlowDirection == 0) {
                lineIndex--;
                if (lineIndex == 0) {
                    indexFlowDirection = 1;
                }
            }
            i++;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder string : strings) {
            result.append(string);
        }

        return result.toString();
    }
}