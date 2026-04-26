class Solution 
{
    int ans = Integer.MAX_VALUE;
    public int minCostClimbingStairs(int[] arr)
    {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return Math.min( 
                   climb(arr, arr.length-1, dp),
                   climb(arr, arr.length-2, dp)
        );
    }

    private int climb(int[] arr, int n, int[] dp)
    {
        if(n == 0 || n == 1)
        {
          return arr[n];
        }

        if(n < 0)
        {
            return 0;
        }

        if(dp[n] != -1)
        {
            return dp[n];
        }

         int one = climb(arr, n-1, dp);
         int two = climb(arr, n-2, dp);

         dp[n] = arr[n] + Math.min(one, two);
         return dp[n];

    }
}
