public class ReverseLinkedList {
    int val;
    ReverseLinkedList next;

    ReverseLinkedList() {
    }

    ReverseLinkedList(int val) {
        this.val = val;
    }

    ReverseLinkedList(int val, ReverseLinkedList next) {
        this.val = val;
        this.next = next;
    }

    public ReverseLinkedList reverseList(ReverseLinkedList head) {
        ReverseLinkedList prev = null;
        ReverseLinkedList temp = head;

        while (temp != null) {
            ReverseLinkedList front = temp.next; // Corrected this line
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ReverseLinkedList node5 = new ReverseLinkedList(5);
        ReverseLinkedList node4 = new ReverseLinkedList(4, node5);
        ReverseLinkedList node3 = new ReverseLinkedList(3, node4);
        ReverseLinkedList node2 = new ReverseLinkedList(2, node3);
        ReverseLinkedList node1 = new ReverseLinkedList(1, node2);

        // Printing the original linked list
        System.out.print("Original list: ");
        printList(node1);

        // Reversing the linked list
        ReverseLinkedList reversedHead = new ReverseLinkedList().reverseList(node1);

        // Printing the reversed linked list
        System.out.print("Reversed list: ");
        printList(reversedHead);
    }

    // Helper method to print the linked list
    public static void printList(ReverseLinkedList head) {
        ReverseLinkedList temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
