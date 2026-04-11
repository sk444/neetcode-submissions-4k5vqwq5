class Solution {
    public int findDuplicate(int[] arr) 
    {
       int n  = arr.length - 1;

       //allowed value from 1 to n only.

       int slow = arr[0];
       int fast = arr[0];
       do
       {
         slow = arr[slow];
         fast = arr[arr[fast]];
       }
       while(slow != fast);

       slow = arr[0];   // go to start

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;   // duplicate

       
      
    }
}
