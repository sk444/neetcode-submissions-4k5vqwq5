class Solution {
    public boolean canJump(int[] arr)
    {
        int maxReach = 0;

        for(int i = 0; i < arr.length; i++)
        {
           if( i > maxReach) return false;

           int currReach =  i + arr[i];

           maxReach = Math.max(maxReach, currReach);

           if(maxReach >= arr.length-1) return true;
        }
        return true;
    }
}
