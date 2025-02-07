package Step09_StacksQueue_30;

class StackLinkList{
    
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
