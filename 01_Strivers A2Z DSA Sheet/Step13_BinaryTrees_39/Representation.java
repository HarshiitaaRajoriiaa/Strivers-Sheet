class Representation {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(root.data); //1



        //tree like this fill form
        // 1
      // 2    3
 //  4    5
    }
}





//*  class have three things value of data , reference to left node and right node 
// will make class node
class Node{
    int data;
    Node left;
    Node right;

    ///constructor to make node by object
   public Node(int data){
    this.data=data;
   }
}