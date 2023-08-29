package Easy.Longest_Common_Prefix_14;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *     1 <= strs.length <= 200
 *     0 <= strs[i].length <= 200
 *     strs[i] consists of only lowercase English letters.
 *
 * */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String s = longestCommonPrefix(new String[]{"cir","car"});
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs){

        if (strs == null || strs.length == 0){
            return "";
        }

        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }


    public static String longestCommonPrefixMyVersion(String[] strs) {

        List<String> stringList = Arrays.stream(strs).sorted(Comparator.comparingInt(String::length)).toList();

        int quantityOfElements = stringList.size();
        StringBuilder commonPrefix = new StringBuilder();
        int shortestLength = stringList.get(0).length();
        for (int i = 0; i < shortestLength; i++) {
            int elementIndex = 0;
            char currentChar = stringList.get(elementIndex).charAt(i);
            int counter = 1;
            for (int j = 1; j < quantityOfElements; j++) {
                char charToCompare = stringList.get(j).charAt(i);
                if (currentChar == charToCompare) {
                    counter++;
                } else {
                    break;
                }
            }
            if (counter == quantityOfElements) {
                commonPrefix.append(currentChar);
                elementIndex++;
            } else {
                break;
            }
        }

        if (commonPrefix.isEmpty()) {
            return "";
        } else {
            return commonPrefix.toString();
        }
    }
}