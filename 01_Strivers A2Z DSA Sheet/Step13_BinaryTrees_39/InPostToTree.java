import java.util.HashMap;
import java.util.Map;

public class InPostToTree {
    public Node buildTree(int[] in_order, int[] post_order) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < in_order.length; i++) {
            inMap.put(in_order[i], i);
        }

        Node root = root(in_order, post_order, 0, post_order.length - 1, 0, in_order.length - 1, inMap);
        return root;

    }

    private Node root(int[] in, int[] pre, int ps, int pe, int is, int ie, Map<Integer, Integer> inMap) {
        if (ps > pe || is > ie)
            return null;
        Node root = new Node(pre[pe]);
        int inroot = inMap.get(root.data); // index of root in in_order
        int numleft = inroot - is;
        root.left = root(in, pre, ps, ps + numleft - 1, is, inroot - 1, inMap);
        root.right = root(in, pre, ps + numleft, pe - 1, inroot + 1, ie, inMap);
        return root;
    }
}