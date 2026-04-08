class Solution {
    public int search(int[] arr, int target)
    {
       return bSearch(arr, 0, arr.length-1, target);
        
    }

    private int bSearch(int[] arr, int l, int r, int target)
    {
      if(l <= r)
      { 
          int m =  (r+l)/2;

          if(arr[m] == target)
          {
            return m;
          }
          else if(arr[m] < target)
          {
            l = m+1;
            return bSearch(arr, l, r, target);
          }
          else
          {
            r = m-1;
            return bSearch(arr, l, r, target);
          }
      }
      return -1;
    }
}
