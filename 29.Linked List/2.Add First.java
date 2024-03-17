Write a Program to add a Node at the beginning of the linked list ?
----- method to addfirst is given below and full code is from line 17 ---------

 // Method to add a new node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


public class q1 {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Method to add a new node at the beginning of the linked list

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        q1 list = new q1();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.println("Linked list after adding elements at the beginning:");
        list.display();
    }
}
