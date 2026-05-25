class Solution {
    public int minEatingSpeed(int[] arr, int h)
    {
        int low = 1;
        int high = max(arr); 
        int ans = high;

        while(low <= high)
        {
           int mid = low + (high - low)/2;

           int time = calculateTime(arr, mid);

           if(time <= h)
           {
            ans = mid;
            high = mid -1;
           }
           else
           {
             low = mid + 1;
           }

        } 
        return ans; 
        
    }

    private int calculateTime(int[] arr, int k)
    {
        int totalHours = 0;

        for(int i = 0; i < arr.length; i++)
        {
            totalHours += Math.ceil((double) arr[i] / k);
        }
        return totalHours;


    }

    private int max(int[] arr)
    {
      int max = Integer.MIN_VALUE;

      for(int i = 0; i < arr.length; i++)
      {
          max = Math.max(max, arr[i]);
      }

      return max;
    }
}
