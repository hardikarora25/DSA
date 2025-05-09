package LinkedList;

public class LinkedList {
    private Node head; // Head of the list
    private Node tail; // Tail of the list
    private int size; // Size of the list

    class Node {
        int data; // Data of the node
        Node next; // Next node in the list

        Node(int data) {
            this.data = data;
            this.next = null;
        } 
    }
    public LinkedList(int data){
        Node newNode = new Node(data); // Create a new node with the given data
        head = newNode; // Set the head to the new node
        tail = newNode; // Set the tail to the new node
        size = 1; // Set the size to 1

    }
    public void printlist(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next; // Move to the next node
        }
    }
    public void gethead(){
        System.out.println("Head: " + head.data); // Print the data of the head node
    }
    public void gettail(){
        System.out.println("Tail: " + tail.data); // Print the data of the tail node
    }
    public void getsize(){
        System.out.println("Size: " + size); // Print the size of the list
    }
    public void append(int data){
        Node newNode = new Node(data); // Create a new node with the given data
        tail.next = newNode; // Set the next of the current tail to the new node
        tail = newNode; // Update the tail to the new node
        size++; // Increment the size of the list
        
}
}
