import java.util.Arrays;

public class HouseRobberII {
    public static int rob(int nums[]){
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);

        int dp1[] =new int[n];
        Arrays.fill(dp1,-1);
        int first = helper(nums,0,n-2,dp1);


        int dp2[]= new int[n];
        Arrays.fill(dp2,-1);
        int second = helper(nums,1,n-1,dp2);

        return Math.max(first,second);


    }
    private static int helper(int nums[] , int i,int end,int dp[]){
        if(i>end) return 0; //if n-2 hoga toh vo n-1 bhi call krega jo hme nhi chiye.
        if(dp[i]!=0) return dp[i];
        int pick=helper(nums,i+2,end,dp)+nums[i];
        int leave =helper(nums,i+1,end,dp);
        return dp[i]=Math.max(pick,leave);
    }
}
