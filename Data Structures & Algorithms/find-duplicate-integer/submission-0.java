class Solution {
    public int findDuplicate(int[] arr) 
    {
       int n  = arr.length - 1;

       // allowed value from 1 to n only.

       boolean[] temp = new boolean[n];

       Arrays.fill(temp, false);

       for(int i = 0; i < arr.length; i++)
       {
          if(temp[arr[i]-1] == true)
          {
            return arr[i];
          }
          else
          {
            temp[arr[i]-1] = true;
          }
       }
       return -1;
    }
}
