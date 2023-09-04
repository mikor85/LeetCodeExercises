package Easy.Binary_Search_704;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testSearch() {

        int[] nums1 = new int[]{-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        assertEquals(4, BinarySearch.search(nums1, target1));
        assertEquals(4, BinarySearch.searchRecursive(nums1, 0, nums1.length - 1, target1));
    }
}