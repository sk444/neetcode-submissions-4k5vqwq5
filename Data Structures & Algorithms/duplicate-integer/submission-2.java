class Solution {
    public boolean hasDuplicate(int[] arr)
    {
       Set<Integer> set = new HashSet<>();

       for(int i = 0; i < arr.length; i++)
       {
        if(!set.add(arr[i]))
        {
            return true;
        }
       }
        return false;
        
    }
}