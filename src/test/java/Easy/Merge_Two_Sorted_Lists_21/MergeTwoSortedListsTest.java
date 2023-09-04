package Easy.Merge_Two_Sorted_Lists_21;

import org.junit.Test;

import static Easy.Merge_Two_Sorted_Lists_21.MergeTwoSortedLists.ListNode;
import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() {

        // Test 1
        ListNode head1 = new ListNode(1);
        ListNode list12 = new ListNode(2);
        ListNode list13 = new ListNode(4);
        head1.next = list12;
        list12.next = list13;

        ListNode head2 = new ListNode(1);
        ListNode list21 = new ListNode(3);
        ListNode list22 = new ListNode(4);
        head2.next = list21;
        list21.next = list22;

        assertEquals("[1,1,2,3,4,4]", MergeTwoSortedLists.mergeTwoLists(head1, head2).toString());
    }
}