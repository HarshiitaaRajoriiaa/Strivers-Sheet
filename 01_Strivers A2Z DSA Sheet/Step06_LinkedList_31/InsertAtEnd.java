
//?https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class InsertAtEnd {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node node = new Node(x);
        if (head == null)
            return node;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

        return head;
    }

    public Node insertAtEndR(Node head, int x) {
        Node node = new Node(x);
        if (head == null)
            return node;
        Node temp = head;
        helper(head, temp, node);
        return head;
    }

    private void helper(Node head, Node temp, Node n) {
        if (temp == null)
            return;
        if (temp.next == null)
            temp.next = n;
        else {
            helper(head, temp.next, n);
        }
    }
}