package Medium.Longest_Substring_Without_Repeating_Characters_3;

import java.util.*;

// Given a string s, find the length of the longest substring without repeating characters.


// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

// Example 3:
// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


// Constraints:
//    0 <= s.length <= 5 * 104
//    s consists of English letters, digits, symbols and spaces.

public class LongestSubstringWithoutRepeatingCharactersSolution {

    public static void main(String[] args) {

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";
        String s5 = " ";
        String s6 = "dvdf";

        System.out.println(lengthOfLongestSubstringSet(s6));
        System.out.println(lengthOfLongestSubstringMap(s6));

    }

    private static int lengthOfLongestSubstringMap(String s) {
        int start = 0;
        int maxLength = 0;
        Map<Character, Integer> processedChars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (processedChars.containsKey(currChar) && start <= processedChars.get(currChar)) {
                start = processedChars.get(currChar) + 1;
            } else {
                maxLength = Math.max(maxLength, i - start + 1);
            }

            processedChars.put(currChar, i);
        }
        return maxLength;
    }

    private static int lengthOfLongestSubstringSet(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Set<Character> substringSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (!substringSet.add(s.charAt(right))) {
                substringSet.remove(s.charAt(left++));
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}