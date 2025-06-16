import java.util.*;
public class SerDeSer {
    // Encodes a tree to a single string.
    public String serialize(Node root) {
        if (root == null) return "";
        Queue<Node> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                sb.append("n ");
            } else {
                sb.append(curr.data).append(" ");
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        if (data == null || data.trim().isEmpty()) return null;
        String[] values = data.split(" ");
        Node root = new Node(Integer.parseInt(values[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int p = 1;
        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (p < values.length && !values[p].equals("n")) {
                Node left = new Node(Integer.parseInt(values[p]));
                curr.left = left;
                q.add(left);
            }
            p++;

            if (p < values.length && !values[p].equals("n")) {
                Node right = new Node(Integer.parseInt(values[p]));
                curr.right = right;
                q.add(right);
            }
            p++;
        }
        return root;
    }
}
