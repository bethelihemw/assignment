package assignment2;


public class LinkedList {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
//    1
    
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
        	System.out.println("Position out of bounds");
        }
        newNode.next = current.next;
        current.next = newNode;
    }

// 2
    public void deleteAtPosition(int position) {
        if (head == null) {
        	System.out.println("sorry! list is empty");
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next == null) {
        	System.out.println("Position out of bounds");

        }
        current.next = current.next.next;
    }
//   3
    
    public void deleteAfterNode(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("it's empty");
        }
        current.next = current.next.next;
    }

// 4
    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

//    5
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    	LinkedList list = new LinkedList();
        list.insertAtPos(100, 1);
        list.insertAtPos(200, 2);
        list.insertAtPos(300, 3);
        list.insertAtPos(400, 2);
        list.display();

        list.deleteAtPosition(3);
        list.display();

        list.deleteAfterNode(100);
        list.display();

        System.out.println("Search 200 = " + list.searchNode(20));
        System.out.println("Search 500 = " + list.searchNode(50));
    }
}

