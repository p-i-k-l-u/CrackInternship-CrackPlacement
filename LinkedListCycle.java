public class LinkedListCycle {

    int val;
    LinkedListCycle next;

    LinkedListCycle(int x) {
        val = x;
        next = null;
    }

    public boolean hasCycle(LinkedListCycle head) {
        LinkedListCycle fast = head;
        LinkedListCycle slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create nodes
        LinkedListCycle node1 = new LinkedListCycle(3);
        LinkedListCycle node2 = new LinkedListCycle(2);
        LinkedListCycle node3 = new LinkedListCycle(0);
        LinkedListCycle node4 = new LinkedListCycle(-4);

        // Create the linked list with a cycle
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Cycle here

        // Test the hasCycle method
        LinkedListCycle head = node1;
        System.out.println(new LinkedListCycle(0).hasCycle(head)); // Output: true
    }
}
