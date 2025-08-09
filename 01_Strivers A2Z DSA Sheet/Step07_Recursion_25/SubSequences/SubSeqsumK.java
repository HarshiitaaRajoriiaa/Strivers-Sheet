package Subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubSeqsumK {

    //?https://www.geeksforgeeks.org/problems/check-if-there-exists-a-subsequence-with-sum-k/1
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        
        List<Integer> curr = new ArrayList<>();
        boolean ans = helper(arr , 0 , curr , K);
        return ans;
        
    }
    public  static boolean  helper(int arr[] , int i ,  List<Integer> curr , int k ){
        if(i==arr.length) {
            //check for sum 
            return sum(curr)==k;
        }
        
        
        //take 
        curr.add(arr[i]);
        if(helper(arr , i+1 , curr , k)) return true;
        
        
        
        //not-take
        curr.remove(curr.size()-1);
        if(helper(arr , i+1 , curr, k)) return true;
        return false;
    }
    
    public static int sum(List<Integer> curr){
        int sum=0;
        for(int i=0;i<curr.size();i++){
            sum+=curr.get(i);
        }
        return sum;
    }
}
