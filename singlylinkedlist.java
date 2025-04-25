class SinglyLinkedList {
    // Node class representing each element in the linked list
    class Node {
        int data;
        Node next;
        
        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Method to insert a new node at the end of the linked list
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to perform linear search in the linked list
    public int linearSearch(int key) {
        int position = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return position; // Found key at the position
            }
            temp = temp.next;
            position++;
        }
        return -1; // Key not found
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Insert elements into the linked list
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        
        // Display the linked list
        System.out.println("Linked List:");
        list.display();
        
        // Search for a value using linear search
        int key = 30;
        int position = list.linearSearch(key);
        if (position != -1) {
            System.out.println("Element " + key + " found at position " + position);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}