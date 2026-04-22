class Solution 
{
    public int change(int target, int[] arr)
    {
        int n = arr.length;
        int[][] dp = new int[n+1][target+1];

        for(int i = 0; i < n+1; i++)
        {
            for(int j = 0; j < target+1; j++)
            {
                dp[i][j] = -1;
            }
        }

        return knapSack(arr, target, arr.length, dp);
        
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

       if(arr[n-1] <= target)
       {
          count = count + knapSack(arr, target-arr[n-1], n, dp) + 
          knapSack(arr, target, n-1, dp);
       }
       else
       {
       count = count + knapSack(arr, target, n-1, dp);
       }
       dp[n][target]= count;
       return count;
    }
}
