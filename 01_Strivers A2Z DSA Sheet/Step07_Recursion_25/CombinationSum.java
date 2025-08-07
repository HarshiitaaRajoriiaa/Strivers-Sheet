package Subsequence;
import java.util.*;
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(candidates , target , ans , curr , 0);
        return ans;
    }

    //helper
    public static void helper(int [] arr , int t , List<List<Integer>> ans , List<Integer> curr , int i){
        if(i==arr.length){
            if(t==0) ans.add(new ArrayList<>(curr));
            return;
        }

        //pick
        curr.add(arr[i]);
        if(arr[i]<= t) helper(arr , t-arr[i] , ans , curr , i);

        //not pick same:
        curr.remove(curr.size()-1);
        helper(arr,t,ans,curr,i+1);



        }
}
