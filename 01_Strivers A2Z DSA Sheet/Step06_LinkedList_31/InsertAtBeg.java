//?https://www.geeksforgeeks.org/problems/linked-list-insertion-at-beginning/1
public class InsertAtBeg {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node node = new Node(x);
        node.next = head;
        head = node;
        return head;
    }
}
