public class reverse {
    class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

    Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;    // Store the next node
            current.next = previous; // Reverse the link
            previous = current;      // Move previous one up
            current = next;          // Move current one up
        }
        head = previous;
        return head;
    }
}
    
}
