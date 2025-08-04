import java.util.*;

public class Fib {
    public static void main(String[] args) {

    }

    // *Recursion
    public int fibR(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fibR(n - 1) + fibR(n - 2);
    }

    // *memoization
    public int fibM(int n) {
        int dp[] = new int[n + 1]; // 0 to n
        Arrays.fill(dp, -1);
        return helper(n, dp);

    }

    public int helper(int n, int dp[]) {
        if (n <= 1)
            return n;
        if (dp[n] != -1)
            return dp[n];
        else {
            dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
            return dp[n];
        }
    }

    // *Tabulation
    public int fibT(int n) {
        if (n <= 0)
            return n;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    //space optimization | Tabulation:
    public int fib(int n) {
        if (n <= 0)
            return n;
        int prev = 1;
        int prevprev = 0;
        for (int i = 2; i <= n; i++) {
            int curr = prev + prevprev;

            prevprev = prev;
            prev = curr;
        }
        return prev;
    }
}