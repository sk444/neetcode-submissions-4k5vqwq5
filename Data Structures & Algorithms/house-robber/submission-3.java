class Solution {
    public int rob(int[] arr)
    {
       int n = arr.length; 
       int[] dp = new int[n];

       Arrays.fill(dp, -1);

       return Math.max(dfs(arr, n-1, dp), dfs(arr, n-2, dp));    
    }

    private int dfs(int[] arr, int n, int[] dp)
    {
        if(n < 0)
        {
          return 0;
        }

        if(n == 0 || n == 1)
        {
            return arr[n];
        }
        if(dp[n] != -1) return dp[n];
        dp[n] = arr[n] + Math.max(dfs(arr, n-2, dp), dfs(arr, n-3, dp));

        return dp[n];

    }
}
