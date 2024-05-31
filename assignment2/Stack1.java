package assignment2;




public class Stack1 {
    private Node top;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack1() {
        this.top = null;
    }


    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }


    public int pop() {
        if (top == null) {

        	System.out.println("the Stack is empty");
            
        }
        int data = top.data;
        top = top.next;
        return data;
    }


    public int peek() {
        if (top == null) {
        	System.out.println("the Stack is empty");
            
        }
        return top.data;
    }

 
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1();
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Current Top: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
