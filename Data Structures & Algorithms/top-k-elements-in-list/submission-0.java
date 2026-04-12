class Solution {
    public int[] topKFrequent(int[] arr, int k) 
    {
      Map<Integer, Integer> map = new HashMap<>();
      int[] ans = new int[k];

      for(int i = 0; i < arr.length; i++)
      {
        if(map.containsKey(arr[i]))
        {
          map.put(arr[i], map.get(arr[i]) + 1);
        }
        else
        {
          map.put(arr[i], 1);
        }
      } 
    

    // arrange the map based on sorting logic, sort must be done based on value.

    List<Map.Entry<Integer, Integer>> list = new ArrayList<>();

     for(Map.Entry<Integer, Integer> entry : map.entrySet())
     {
        list.add(entry);
     }

    List<Map.Entry<Integer, Integer>> list1
     = list.stream().sorted(Comparator.comparingInt(Map.Entry<Integer, Integer> :: getValue)
     .reversed()).collect(Collectors.toList());

     for(int i = 0; i < k; i++)
     {
      ans[i] = list1.get(i).getKey();
     }

     return ans;

    }
    
}
