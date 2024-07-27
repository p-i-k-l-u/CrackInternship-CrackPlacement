public class MergeTwoLinkedList {
    int val;
    MergeTwoLinkedList next;

    MergeTwoLinkedList() {
    }

    MergeTwoLinkedList(int val) {
        this.val = val;
    }

    MergeTwoLinkedList(int val, MergeTwoLinkedList next) {
        this.val = val;
        this.next = next;
    }

    public MergeTwoLinkedList mergeTwoLists(MergeTwoLinkedList l1, MergeTwoLinkedList l2) {
        // Create a sentinel/dummy node to start
        MergeTwoLinkedList sentinel = new MergeTwoLinkedList(Integer.MIN_VALUE);

        // Create a copy of this node to iterate while solving the problem
        MergeTwoLinkedList current = sentinel;

        // Traverse till one of the list reaches the end
        while (l1 != null && l2 != null) {
            // Compare the 2 values of lists
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append the remaining list
        if (l1 == null) {
            current.next = l2;
        } else {
            current.next = l1;
        }

        // Return the next node to sentinel node
        return sentinel.next;
    }

    public static void printList(MergeTwoLinkedList node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create first linked list: 1 -> 2 -> 4
        MergeTwoLinkedList l1 = new MergeTwoLinkedList(1);
        l1.next = new MergeTwoLinkedList(2);
        l1.next.next = new MergeTwoLinkedList(4);

        // Create second linked list: 1 -> 3 -> 4
        MergeTwoLinkedList l2 = new MergeTwoLinkedList(1);
        l2.next = new MergeTwoLinkedList(3);
        l2.next.next = new MergeTwoLinkedList(4);

        // Merge the two linked lists
        MergeTwoLinkedList merger = new MergeTwoLinkedList();
        MergeTwoLinkedList mergedList = merger.mergeTwoLists(l1, l2);

        // Print the merged linked list
        printList(mergedList);
    }
}
