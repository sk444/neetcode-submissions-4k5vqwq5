class Solution {
    public int climbStairs(int n)
    {
        // n=10 steps to reach the top.
        // at a time 1 or 2 steps at the time.

        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);

        return climb(n, dp);
        
    }

    private int climb(int n, int[] dp)
    {
        if(n == 0)
        {
            return 1;
        }

        if(n < 0)
        {
            return 0;
        }

        if(dp[n] != -1) return dp[n];

        int count = 0;

        count = count + climb(n-1, dp);
        count = count + climb(n-2, dp);

        dp[n] = count;

        return count;
    }
}
