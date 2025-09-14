//?https://www.hackerrank.com/challenges/insert-a-Node-at-a-specific-position-in-a-linked-list/problem?isFullScreen=true
class Node {
    int data;
    static Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class InsertAti {
    public Node insertNodeAtPosition(Node llist, int data, int position) {
        // Write your code here
        // position 2 = after 2
        // 0 to position 2 means after 2
        Node node = new Node(data);
        if (position == 0) {
            Node.next = llist;
            return node;
        }

        if (llist == null)
            return node;
        Node temp1 = llist;
        Node temp2 = llist;

        int in = 0;
        while (in < position) {
            temp1 = temp2;
            temp2 = temp2.next;
            in++;
        }
        while (in < position - 1) {
            // temp1 = temp2;
            temp2 = temp2.next;
            in++;
        }
        // now in is the position where we have to place our Node
        node.next = temp2;
        temp1.next = node;

        // Node.next = temp2.next;
        // temp2.next = Node;
        // with one pointer.

        return llist;
    }

}
