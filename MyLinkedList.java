public class MyLinkedList {
    
    // Node class
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public MyLinkedList() {
        head = null;
    }

    // Head of list
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public node deleteFirst() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        head = head.next;
        return temp;
    }

    public node deleteLast() {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            Node temp = head;
            head = null;
            return temp;
        }

        Node secondLast = head;
        while(secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        Node temp = secondLast.next;
        secondLast.next = null;
        return temp;
    }

    public String toString() {
        String result = "[";
        Node current = head;
        while(current != null) {
            result += current.data + ", ";
            current = current.next;
        }
        result += "]";
        return result;
    }





}