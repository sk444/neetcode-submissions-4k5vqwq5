class Solution {
    public boolean canPartition(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
          sum = sum + arr[i];
        }

        // find the subset whose sum is sum/2

        if(sum % 2 != 0) return false;


        int targetSum = sum / 2;

        Boolean[][] dp = new Boolean[arr.length+1][targetSum+1];

        return knapSack(arr, targetSum, arr.length, dp);
    }

    private boolean knapSack(int[] arr, int targetSum, int n, Boolean[][] dp)
    {
       if(targetSum == 0)
       {
         return true;
       }

       if(n == 0)
       {
        return false;
       }

       if(dp[n][targetSum] != null) return dp[n][targetSum];
        
       if(arr[n-1] <= targetSum)
       {
        dp[n][targetSum] = knapSack(arr, targetSum-arr[n-1], n-1, dp) ||
        knapSack(arr, targetSum, n-1, dp);
       }
       else 
       {
         dp[n][targetSum] = knapSack(arr, targetSum, n-1, dp);
       } 

       return dp[n][targetSum];


    }
}
