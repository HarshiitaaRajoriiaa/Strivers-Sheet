import java.util.*;
public class MaxWidth {
    class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        //index all the node ( present + imaginary )
        //they called segment trees
        // 0 based = l(2*i +1) , r(2*i +2) , 1 based = l(2*i) , r(2*i +1)
        //for big tree  value of child (l(2*i +1) , r(2*i +2) ) or (l(2*i) , r(2*i +1)) will give interger overflow 
        //level order traversal and calculate maximum of width level wise using bfs traversal
        if(root==null) return 0;
        int ans =0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root , 0));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().index; //always left most one is smallest loically 
            int first = 0 ; int last = 0;
            for(int i = 0 ; i < size;i++){
                int curr_id = q.peek().index - min;
                TreeNode curr_node = q.peek().node;
                q.poll();
                if(i==0) first = curr_id;
                if(i==size-1) last = curr_id;

                if(curr_node.left !=null) q.offer(new Pair(curr_node.left , (curr_id*2) +1));
                if(curr_node.right !=null) q.offer(new Pair(curr_node.right , (curr_id*2)+2));

            }
            ans = Math.max(ans , last-first+1);
        }

        return ans;
    }
}
