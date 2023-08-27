package Easy.reverse_linked_list_206;

public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode headNode = createLinkedList(10);
        printLinkedList(headNode);
        headNode = reverse(headNode);
        printLinkedList(headNode);
    }

    private static ListNode reverse(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    private static ListNode createLinkedList(int n) {
        ListNode firstNode = null;
        for (int i = 0; i < n; i++) {
            firstNode = new ListNode(i, firstNode);
        }
        return firstNode;
    }

    public static void printLinkedList(ListNode firstNode) {
        ListNode pointer = firstNode;
        while (pointer != null) {
            if (pointer.next != null) {
                System.out.print(pointer.value + " -> ");
            } else {
                System.out.println(pointer.value + " -> NULL");
            }
            pointer = pointer.next;
        }
    }
}

