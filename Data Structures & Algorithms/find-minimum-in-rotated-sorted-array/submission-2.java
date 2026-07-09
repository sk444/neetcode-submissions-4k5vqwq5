class Solution
{
    public int findMin(int[] arr) 
    {
      int left = 0;
      int right = arr.length-1;

      return bs(arr, left, right);
    }

    private int bs(int[]arr, int left, int right)
    {
        while(left < right)
        {
          int middle = (right + left)/2;

          if(arr[middle] > arr[right])
          {
            left = middle+1;
          }
          else
          {
           right = middle;
          }
        }
        return arr[left];
    }
}
