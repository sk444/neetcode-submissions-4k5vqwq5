class Solution {
    public int findTargetSumWays(int[] arr, int target) 
    {
       // int[][] dp = new int[arr.length+1][target+1];

        // for(int i = 0; i < arr.length+1; i++)
        // {
        //   for(int j = 0; j < target+1; j++)
        //   {
        //     dp[i][j] = Integer.MIN_VALUE;
        //   }

        // }
       return knapSack(arr, target, arr.length);
        
    }

    private int knapSack(int[] arr, int target, int n)
    {
        if(n == 0 && target > 0)
        {
            return 0;
        }

        if(n == 0 && target == 0)
        {
            return 1;
        }

        if(n==0) return 0;
        

        // if(dp[n][target] != Integer.MIN_VALUE)
        // {
        //     return dp[n][target];
        // }

        int count = 0;
       
            count = count + knapSack(arr, target-arr[n-1], n-1);
            count = count + knapSack(arr, target+arr[n-1], n-1); 
    
        
        
       // dp[n][target] = count;
        return count;
    } 
}
