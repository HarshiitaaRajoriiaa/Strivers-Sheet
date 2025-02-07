package Step14_Binary_16;


public class Node {
    int data;
    Node left, right;

    //constructor for data of node:
    public Node( int data){
        this.data = data;
        left = right = null;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
    }
}