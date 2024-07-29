public class IntersectionOfTwoLinkedList {
    int val;
    IntersectionOfTwoLinkedList next;

    IntersectionOfTwoLinkedList(int x) {
        val = x;
        next = null;
    }

    public IntersectionOfTwoLinkedList getIntersectionNode(IntersectionOfTwoLinkedList headA,
            IntersectionOfTwoLinkedList headB) {

        if (headA == null || headB == null) {
            return null;
        }

        IntersectionOfTwoLinkedList temp1 = headA;
        IntersectionOfTwoLinkedList temp2 = headB;

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

            if (temp1 == temp2)
                return temp1; // here you can also return temp2

            if (temp1 == null)
                temp1 = headB;
            if (temp2 == null)
                temp2 = headA;
        }

        return temp1;
    }

    public static void main(String[] args) {
        // Creating the intersection node
        IntersectionOfTwoLinkedList intersectNode = new IntersectionOfTwoLinkedList(8);
        intersectNode.next = new IntersectionOfTwoLinkedList(4);
        intersectNode.next.next = new IntersectionOfTwoLinkedList(5);

        // Creating listA
        IntersectionOfTwoLinkedList listA = new IntersectionOfTwoLinkedList(4);
        listA.next = new IntersectionOfTwoLinkedList(1);
        listA.next.next = intersectNode;

        // Creating listB
        IntersectionOfTwoLinkedList listB = new IntersectionOfTwoLinkedList(5);
        listB.next = new IntersectionOfTwoLinkedList(6);
        listB.next.next = new IntersectionOfTwoLinkedList(1);
        listB.next.next.next = intersectNode;

        // Finding the intersection node
        IntersectionOfTwoLinkedList result = new IntersectionOfTwoLinkedList(0).getIntersectionNode(listA, listB);

        if (result != null) {
            System.out.println("Intersected at '" + result.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}
