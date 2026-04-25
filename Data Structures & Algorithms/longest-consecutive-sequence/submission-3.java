class Solution {
    public int longestConsecutive(int[] arr)
    {
    
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++)
        {
            set.add(arr[i]);
        }

     int max = 0;

     for(int i = 0; i < arr.length; i++)
     { 
        int next = arr[i] + 1;
        int count = 1;

        while(set.contains(next))
        {
            count++;
            next = next+1;
        }

        max = Math.max(count, max);
        count = 1;
     }
     return max;
        
    }
}
