import java.util.Arrays;

public class FrogWithKJumps {
    public static void main(String[] args) {
        
    }

    //*Recursion
    int minRecursion(int n[],int k){
        if(n.length==0) return 0;
        return helperR(n.length-1, n, 4);
        
    }
    private static int helperR(int i , int n[] ,int k){
        if(i==0) return 0;
        int min = Integer.MAX_VALUE;
        for(int j=0;j<=k;j++){
            if(i-j>=0){    //if i=2 and k=3
                int jump = helperR(i-1, n, k) + Math.abs(n[i]-n[i-j]);
            Math.min(min , jump);
            }
            
        }
        return min;
    }


    //*Memoization
    int minMemoization(int n[], int k){
        int dp[] = new int[n.length];
        Arrays.fill(dp, -1);
        return helperM(n.length-1,n,dp,k);
    }

    private static int helperM(int i , int n[] , int dp[] , int k){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(i-j>=0){
                int jumps = helperM(i-1, n, dp, k) + Math.abs(n[i]-n[i-j]);
                min= Math.min(min, jumps);
            }
        }
        return dp[i]=min;
    }
}



