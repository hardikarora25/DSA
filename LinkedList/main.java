package LinkedList;

public class main {
    public static void main(String[] args) {
        
        LinkedList myLinkedList = new LinkedList(10); // Create a new linked list with the first node having data 10
        myLinkedList.append(20); // Append 20 to the list
        myLinkedList.append(50); // Append 50 to the list
        myLinkedList.append(30); // Append 30 to the list
        myLinkedList.append(40); // Append 40 to the list
        myLinkedList.printlist(); // Print the list
        myLinkedList.reverselist().printlist();
        System.out.println("Kth node from end: " + myLinkedList.getkthnodefromend(2));
        // Get the head of the list
    }
    
}
