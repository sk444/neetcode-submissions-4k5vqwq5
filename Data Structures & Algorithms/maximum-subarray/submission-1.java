class Solution {
    public int maxSubArray(int[] arr) 
    {
       int currSum = 0; 
       int max = Integer.MIN_VALUE;
    

       for(int i = 0; i < arr.length; i++)
       {
          currSum = currSum + arr[i];

          max = Math.max(max, currSum);

          if(currSum < 0)
          {
            currSum = 0;
          }
       }

       return max;
        
    }
}
