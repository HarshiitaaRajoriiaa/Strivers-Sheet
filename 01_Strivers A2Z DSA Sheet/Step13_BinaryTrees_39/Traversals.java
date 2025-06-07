//todo TRAVERSAL TECHNIQUES-
//* INORDER :  left root right
//* PREORDER:  root left right
//* POSTORDER: left right root

public class Traversals {

    // Preorder
    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    // inorder
    public static void inOrder(Node root) {
        if (root == null)
            return;
        preOrder(root.left);
        System.out.println(root.data);
        preOrder(root.right);
    }

    // postorder
    public static void postOrder(Node root) {
        if (root == null)
            return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data);
    }
}

// ? https://leetcode.com/problems/binary-tree-preorder-traversal/
// public List<Integer> preorderTraversal(TreeNode root) {
// ArrayList<Integer> ans = new ArrayList<>();
// preorder(root, ans);
// return ans;
// }

// private void preorder(TreeNode node, List<Integer> ans) {
// if (node == null)
// return;
// ans.add(node.val); // Visit root
// preorder(node.left, ans); // Traverse left
// preorder(node.right, ans); // Traverse right
// }

// todo iterative Preorder traversal
// using stack : phle print baad m add , right then left , LIFO
// public List<Integer> preorderTraversal(TreeNode root) {
// List<Integer> ans = new ArrayList<>();
// if (root == null)
// return ans;
// Stack<TreeNode> s = new Stack<>();
// s.push(root);
// while (!s.isEmpty()) {
// root = s.pop();
// ans.add(root.val);
// if (root.right != null)
// s.push(root.right);
// if (root.left != null)
// s.push(root.left);

// }
// return ans;
// }

// ?
// https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/1647737083/
// public List<Integer> inorderTraversal(TreeNode root) {
// ArrayList<Integer> ans = new ArrayList<>();
// inOrder(root , ans);
// return ans;
// }

// public static void inOrder(TreeNode root , List<Integer> ans){
// if(root==null) return;
// inOrder(root.left , ans);
// ans.add(root.val);
// inOrder(root.right , ans);
// }

// todo iterative inorder traversal
// using stack

// ? https://leetcode.com/problems/binary-tree-postorder-traversal/
// public List<Integer> postorderTraversal(TreeNode root) {
// List<Integer> ans = new ArrayList<>();
// postOrder(root, ans);
// return ans;

// }

// private void postOrder(TreeNode node, List<Integer> ans) {
// if (node == null)
// return;
// postOrder(node.left, ans); // Traverse left
// postOrder(node.right, ans);
// ans.add(node.val); // Visit root
// Traverse right
// }


// todo iterative postorder
// using 2 stacks
// public List<Integer> postorderTraversal(TreeNode root) {
//     List<Integer> ans = new ArrayList<>();
//     Stack<TreeNode> s1 = new Stack<>();
//     Stack<TreeNode> s2 = new Stack<>();
//     if (root == null)
//         return ans;
//     s1.push(root);

//     while (!s1.isEmpty()) {
//         TreeNode curr = s1.pop(); // tos
//         s2.push(curr);

//         if (curr.left != null)
//             s1.push(curr.left);
//         if (curr.right != null)
//             s1.push(curr.right);
//     }

//     while (!s2.isEmpty()) {
//         ans.add(s2.pop().val);
//     }
//     return ans;
// }
