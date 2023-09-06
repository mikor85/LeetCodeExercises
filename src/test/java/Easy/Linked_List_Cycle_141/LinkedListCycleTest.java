package Easy.Linked_List_Cycle_141;

import org.junit.Test;
import static Easy.Linked_List_Cycle_141.LinkedListCycle.ListNode;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleTest {

    @Test
    public void testHasCycle() {

        ListNode head = new ListNode(3);
        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(0);
        ListNode list3 = new ListNode(-4);

        head.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = list1;

        assertTrue(LinkedListCycle.hasCycle(head));
    }
}