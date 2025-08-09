import java.util.*;
class Solution {
    //*recursion
    int minCostR(int[] height) {
        // code here
        int n = height.length;
        return helper(n-1 , height);
        
        
    }
    
    int helper(int i , int [] height){
        if(i==0) return 0;
        int one = helper(i-1 , height) + Math.abs(height[i]-height[i-1]);
        int two = Integer.MAX_VALUE;
        if(i>1){
            two = helper(i-2 , height) + Math.abs(height[i]-height[i-2]);
        }
        return Math.min(one , two);
    }
    
    
    
    
    
    //*memoization
    int minCostM(int[] height) {
        // code here
        int n = height.length;
        int dp[] = new int[n];
        Arrays.fill(dp ,-1);
        return helper(dp , height , n-1);
        
    }
    
    int helper(int dp[] , int []h, int i ){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int one = helper(dp ,h,i-1 )+ Math.abs(h[i]-h[i-1]);
        int two = Integer.MAX_VALUE;
        if(i>1) two = helper(dp,h,i-2)+ Math.abs(h[i]-h[i-2]);
        dp[i] = Math.min( one,two );
        return dp[i];
    }
    
    
    
    //*tabulation
    int minCost(int[] height) {
        // code here
        int n = height.length;
        int dp[] = new int[n];
        dp[0]=0;
        dp[1]=Math.abs(height[1]-height[0]);
        for(int ind=1;ind<n;ind++){
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne= dp[ind-1] + Math.abs(height[ind]-height[ind-1]);
            if(ind>1) jumpTwo = dp[ind-2] + Math.abs(height[ind]-height[ind-2]);
            dp[ind]=Math.min(jumpOne, jumpTwo);
       
        }
        return dp[n-1];
    }



    
}
