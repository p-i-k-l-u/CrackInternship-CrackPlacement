public class RemoveLinkedListElement {

    int val;
    RemoveLinkedListElement next;

    RemoveLinkedListElement(int val, RemoveLinkedListElement next) {

        this.val = val;
        this.next = next;
    }

    public RemoveLinkedListElement removeElement(RemoveLinkedListElement head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }

        RemoveLinkedListElement currNode = head;
        while (currNode.next != null) {
            if (currNode.next.val == val) {
                currNode.next = currNode.next.next;

            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Create a linked list
        RemoveLinkedListElement node4 = new RemoveLinkedListElement(4, null);
        RemoveLinkedListElement node3 = new RemoveLinkedListElement(3, node4);
        RemoveLinkedListElement node2 = new RemoveLinkedListElement(2, node3);
        RemoveLinkedListElement head = new RemoveLinkedListElement(1, node2);

        // Print original list
        System.out.println("Original list:");
        printList(head);

        // Remove element
        int valToRemove = 2;
        head = head.removeElement(head, valToRemove);

        // Print modified list
        System.out.println("List after removing " + valToRemove + ":");
        printList(head);
    }

    public static void printList(RemoveLinkedListElement head) {
        RemoveLinkedListElement currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

}
