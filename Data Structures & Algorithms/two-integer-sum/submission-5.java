class Solution {
    public int[] twoSum(int[] arr, int target)
    {
     Map<Integer, List<Integer>> map = new HashMap<>();
     int[] ans = new int[2];

     for(int i = 0; i < arr.length; i++)
     {
        List<Integer> list = null;
        if(!map.containsKey(arr[i]))
        {
           list = new ArrayList<>();
           map.put(arr[i], list);
        }

        map.get(arr[i]).add(i);
     }

     for(int i = 0; i < arr.length; i++)
     {
       int result = (target - arr[i]);

       if(!map.containsKey(result)) continue;

       List<Integer> list = map.get(result);

       for(Integer num : list)
       {
         if(num != i) 
         {
           if(i > num)
           {
            ans[0] = num;
            ans[1] = i;
           }
           else
           {
            ans[0] = i;
            ans[1]= num;
           }
           return ans;
         }
       }
     }
     return ans;
    }
}
