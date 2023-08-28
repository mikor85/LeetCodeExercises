package Easy.Palindrome_Number_9;

/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
 *
 * Constraints:
 *     -231 <= x <= 231 - 1
 *
 * Follow up: Could you solve it without converting the integer to a string?
 * */


public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 12;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Calculate the length of the number
        int originalX = x;
        int length = 0;
        while (x > 0) {
            x /= 10;
            length++;
        }

        // Reverse the second half of the number
        int reversed = 0;
        x = originalX; // Reset x to its original value
        for (int i = 0; i < length / 2; i++) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // If the length is odd, skip the middle digit
        if (length % 2 == 1) {
            x /= 10;
        }

        // Compare the reversed second half with the first half
        return x == reversed;
    }
}