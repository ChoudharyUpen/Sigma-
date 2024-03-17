// Node class represents an individual node in the linked list
//this code is useful in creating a single node of a linked list
class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node

    // Constructor to initialize a node with given data
    Node(int data) {
        this.data = data;
        this.next = null; // Initially, next is null as it's the last node
    }
}
