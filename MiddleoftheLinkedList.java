public class MiddleoftheLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // Connect nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Create an instance of MiddleoftheLinkedList
        MiddleoftheLinkedList solution = new MiddleoftheLinkedList();

        // Call the middleNode method
        ListNode middle = solution.middleNode(node1);

        // Print the result
        System.out.println("Middle node: " + middle.val);
    }
}
