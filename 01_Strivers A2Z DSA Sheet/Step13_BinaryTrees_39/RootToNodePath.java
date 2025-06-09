import java.util.*;
public class RootToNodePath {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        
    }

    public static boolean pathOrNot(Node root , ArrayList<Integer> ans , int node ){
        if(root==null) return false;
        ans.add(root.data);
        if(root.data == node) {
            return true;
        }

        if(pathOrNot(root.left, ans, node) || pathOrNot(root.right, ans, node)){
            return true;
        }

        ans.remove(ans.size()-1);
        return false;
    }

    public ArrayList<Integer> rootToNodePath(Node root , Node node){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        pathOrNot(root, ans, node.data);
        return ans;
    }

} 