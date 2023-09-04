package Easy.Merge_Two_Sorted_Lists_21;

/*
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 * Constraints:
 *     The number of nodes in both lists is in the range [0, 50].
 *     -100 <= Node.val <= 100
 *     Both list1 and list2 are sorted in non-decreasing order.
 *
 * */

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {

            StringBuilder outputString = new StringBuilder();
            outputString.append("[");
            ListNode currentNode = this;
            while (currentNode != null) {
                outputString.append(currentNode.val);
                if (currentNode.next != null) {
                    outputString.append(",");
                }
                currentNode = currentNode.next;
            }
            outputString.append("]");
            return outputString.toString();
        }
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        ListNode list12 = new ListNode(2);
        ListNode list13 = new ListNode(4);
        list1.next = list12;
        list12.next = list13;
        System.out.println("List No. 1: " + list1);

        ListNode list2 = new ListNode(1);
        ListNode list22 = new ListNode(3);
        ListNode list23 = new ListNode(4);
        list2.next = list22;
        list22.next = list23;
        System.out.println("List No. 2: " + list2);

        ListNode mergedList = mergeTwoListsIterative(list1, list2);
        System.out.println("Merged List: " + mergedList);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode mergedHead;
        if (list1.val < list2.val) {
            mergedHead = list1;
            mergedHead.next = mergeTwoLists(list1.next, list2);
        } else {
            mergedHead = list2;
            mergedHead.next = mergeTwoLists(list1, list2.next);
        }

        return mergedHead;
    }

    // Merge two sorted linked lists iteratively
    public static ListNode mergeTwoListsIterative(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If one list is exhausted, append the remaining elements of the other list
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return dummyHead.next;
    }
}