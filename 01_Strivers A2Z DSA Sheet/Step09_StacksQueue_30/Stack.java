package Step09_StacksQueue_30;
//  top --> Node -> Node -> Node -> Node -> Node -> Node -> Node |end of stack

import java.util.LinkedList;


//using one queue by striver
//todo class StackQueue{
//     Queue <Integer> q = new LinkedList<>();
//     void push(it a){
//         q.add(a);
//         while(q.size()>1){
//             q.add(q.remove());
//         }
//     }
//     int pop() {
//         return q.remove();
//     }
//     int top() {
//         return q.peek();
//     }
//     int size() {
//         return q.size();
//     }
// }
//! TC=0(1) SC=0(N)
class StackLinkList {
    private Node top;
    private int size;

    // Node class
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public StackLinkList() {
        top = null;
        size = 0;
    }

    // Push method
    public void push(int n) {
        Node newN = new Node(n);
        newN.next = top; // New node points to previous top
        top = newN; // Update top to new node
        size++;
    }

    // Pop method
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        top = top.next; // Move top to the next node
        size--;
    }

    // Peek method (optional, to get the top element)
    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Size method
    public int size() {
        return size;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

//! TC=0(1) SC=0(N)
class StackArray {
    private int[] stack;
    private int top; //arr.length-1
    private int size; // arr.length

    public StackArray(int desiredSize) {
        stack = new int[desiredSize];
        top = -1;
        size = 0;
    }

    public void push(int n) {
        if (size == stack.length) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = n;
        size++;
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
        size--;
    }

    public int top() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public int size() {
        //return stack.length;
        return size;
    }

    public boolean isEmpty() {
        return size < 0;
    }
}

public class Stack {
    public static void main(String[] args) {
        StackArray stack = new StackArray(10);

        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        
        stack.pop();//pop out 9
        
        System.out.println("Top element is: " + stack.top());
        System.out.println("Stack size is: " + stack.size());
    }
}
