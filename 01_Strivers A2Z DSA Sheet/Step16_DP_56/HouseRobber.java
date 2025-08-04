public class HouseRobber {
    public int maxAmount(int n[]){
        return helper(n.length-1, n);

    }
    private static int helper(int i , int n[]){
        if(i==0) return n[0];
        if(i==1) return Math.max(n[0], n[1]);
        int pick = helper(i-2 , n) + n[i];
        int not = helper(i-1,n);
        return Math.max(pick, not);
    }

    //*Tabulation
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int pick = nums[i] + dp[i - 2]; // pick current and add from 2 steps back //in memory optimzation take int prev
            int notPick = dp[i - 1]; // don't pick current, take previous best //and this is prevv or 
            dp[i] = Math.max(pick, notPick); // choose the better option
        }
        return dp[nums.length-1];
    }



}
