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

        return knapSack(arr, targetSum, arr.length);
    }

    private boolean knapSack(int[] arr, int targetSum, int n)
    {
       if(n >= 0 && targetSum == 0)
       {
         return true;
       }

       if(n == 0 && targetSum != 0)
       {
        return false;
       }
        
       if(arr[n-1] <= targetSum)
       {
        return knapSack(arr, targetSum-arr[n-1], n-1) ||
        knapSack(arr, targetSum, n-1);
       }
       else 
       {
         return knapSack(arr, targetSum, n-1);
       } 


    }
}
