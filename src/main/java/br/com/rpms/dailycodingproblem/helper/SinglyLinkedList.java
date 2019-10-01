package br.com.rpms.dailycodingproblem.helper;

public class SinglyLinkedList<T> {

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(T ... nodeValues) {
        for (T value : nodeValues) {
            insert(value);
        }
    }

    private int size = 0;
    private Node<T> head; // head of list

    public SinglyLinkedList insert(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = null;

        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = newNode;
        } else {
            // Else traverse till the last node and insert the newNode there
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the newNode at last node
            last.next = newNode;
        }

        size++;

        return this;
    }

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node currNode = head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Singly linked list Node.
    public class Node<U> {
        U data;
        Node<U> next;

        Node(U data) {
            this.data = data;
            next = null;
        }

        public U getData() {
            return data;
        }

        public Node<U> getNext() {
            return next;
        }

    }
}
