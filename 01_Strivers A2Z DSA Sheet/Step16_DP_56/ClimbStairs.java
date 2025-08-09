import java.util.*;
public class ClimbStairs {

    //*Memoization
    public int climbStairsR(int n){
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);

    }
    private static int helper( int i ,  int dp[]){
        if(i==0) return 1;
        if(i==1) return 1; 
        if(dp[i]!=-1) return dp[i];
        int one = helper(i-1,dp);
        int two=helper(i-2, dp);
        dp[i]=one+two;
        return dp[i];
    }
    //*Tabulation / space complexity
    public int climbStairs(int n) {
        if (n <= 1)
            return n;
        int prev = 1;
        int prevv = 1;
        int curr = 0;
        for (int i = 2; i <= n; i++) {
            curr = prev + prevv;
            prevv = prev;
            prev = curr;
        }
        return curr;
    }
} 