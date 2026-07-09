class Solution
{
    public int findMin(int[] arr) 
    {
        int left = 0;
        int right = arr.length-1;

        while(left < right)
        {
          int middle = left + (right-left)/2;

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
