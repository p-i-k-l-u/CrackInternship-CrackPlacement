import java.util.*;

// Node class represents a node in a linked list
class Node {
    int data; // Data stored in the node
    Node next; // Pointer to the next node in the list

    // Constructor with both data and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class KReverse {

    static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node temp = head;

        while (temp != null) {
            Node nextNode = temp.next; // Store the next node
            temp.next = prev; // Reverse the direction of the current node's next pointer
            prev = temp; // Move 'prev' to the current node
            temp = nextNode; // Move 'temp' to the next node in the list
        }

        return prev; // Return the new head of the reversed linked list
    }

    // Function to get the Kth node from a given position in the linked list
    static Node getKthNode(Node temp, int k) {
        for (int i = 1; i < k && temp != null; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Function to reverse nodes in groups of K
    static Node kReverse(Node head, int k) {
        Node temp = head;
        Node newHead = null; // To store the new head of the list
        Node prevGroupEnd = null; // To track the last node of the previous group

        while (temp != null) {
            Node groupStart = temp; // Mark the start of the group
            Node kthNode = getKthNode(temp, k); // Find the Kth node

            // If Kth node is null, it means the remaining nodes are less than k
            if (kthNode == null) {
                if (prevGroupEnd != null) {
                    prevGroupEnd.next = groupStart; // Link the last group's end to the remaining part
                }
                break;
            }

            Node nextGroupStart = kthNode.next; // Store the next group's starting node
            kthNode.next = null; // Break the list for reversal

            // Reverse the current group
            Node reversedGroupHead = reverseLinkedList(groupStart);

            // If it's the first group, update the new head
            if (newHead == null) {
                newHead = reversedGroupHead;
            }

            // Link the previous group's end to the start of the reversed group
            if (prevGroupEnd != null) {
                prevGroupEnd.next = reversedGroupHead;
            }

            // Update prevGroupEnd to the start of this group (which is now the end after reversal)
            prevGroupEnd = groupStart;

            // Move to the next group
            temp = nextGroupStart;
        }

        return newHead != null ? newHead : head; // Return the new head of the modified list
    }

    // Function to print the linked list
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with values 5, 4, 3, 7, 9, and 2
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(2);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list in groups of 4
        head = kReverse(head, 4);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
