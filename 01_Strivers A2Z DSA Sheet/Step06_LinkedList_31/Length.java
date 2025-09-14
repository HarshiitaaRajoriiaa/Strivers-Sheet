//?http://geeksforgeeks.org/problems/count-nodes-of-linked-list/1
public class Length {
    public int getCount(Node head) {
        // code here
        int l = 1;
        Node mover = head;
        
        if(head==null) return 0;
        while(mover.next!=null){
            mover = mover.next;
            l++;
        }
        return l;
    }
    public int getCountR(Node head) {
        // code here
        if(head==null) return 0;
        return helper(head);
    }
    private int helper(Node temp ){
        if(temp==null) return 0;
        return 1+helper(temp.next);
    }
}
