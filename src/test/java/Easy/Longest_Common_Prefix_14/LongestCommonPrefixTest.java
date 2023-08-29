package Easy.Longest_Common_Prefix_14;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {

        String[] strs1 = new String[]{"flower","flow","flight"};
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(strs1));
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefixMyVersion(strs1));

        String[] strs2 = new String[]{"dog","racecar","car"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs2));
        assertEquals("", LongestCommonPrefix.longestCommonPrefixMyVersion(strs2));

        String[] strs3 = new String[]{"cir","car"};
        assertEquals("c", LongestCommonPrefix.longestCommonPrefix(strs3));
        assertEquals("c", LongestCommonPrefix.longestCommonPrefixMyVersion(strs3));

    }
}