package Subsequence;
import java.util.*;
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(k,n,ans,curr,1);
        return ans;
        
    }
    private void helper(int k , int t , List<List<Integer>> ans , List<Integer> curr , int curr_num){
        if(curr.size()==k && t==0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        //base case
        if(curr.size()>k || t<0 || curr_num>9) return;
        //pick
        curr.add(curr_num);
        helper(k,t-curr_num , ans ,curr , curr_num+1);


        //not pick
        curr.remove(curr.size()-1);
        helper(k,t,ans,curr,curr_num+1);
    }
}
