class Solution {
    public boolean searchMatrix(int[][] arr, int target) 
    {
        int m = arr.length;
        int n = arr[0].length;

        int low = 0;
        int high = (m*n)-1;

        while(low <= high)
        {
          int mid = (high + low)/2;

          int row = mid / n;
          int col = mid % n;

          int value = arr[row][col];

          if(value == target)
          {
            return true;
          }

          if(target < value)
          {
            high = mid - 1;
          }
          else
          {
            low = mid + 1;
          }
        }
        return false;

        
    }
}
