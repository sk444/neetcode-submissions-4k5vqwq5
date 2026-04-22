class Solution 
{
    public int change(int target, int[] arr)
    {
        int n = arr.length;
        int[][] dp = new int[n+1][target+1];

          // base case
        for(int i = 0; i <= n; i++)
        {
            dp[i][0] = 1; // one way to make sum 0
        }
        for(int i = 1; i < n+1; i++)
        {
            for(int j = 1; j < target+1; j++)
            {
                if(arr[i-1] <= j)
                {
                  dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
                }
                else
                {
                  dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][target];
        
    }

    private int knapSack(int[] arr, int target, int n, int[][] dp)
    {
       if(n == 0 && target > 0)
       {
          return 0;
       }

       if( n >= 0 && target == 0)
       {
         return 1;
       }

       if(dp[n][target]!= -1)
       {
        return dp[n][target];
       }

       int count = 0;

      
       dp[n][target]= count;
       return count;
    }
}
