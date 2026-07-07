class Solution {
    public int[] twoSum(int[] arr, int target)
    {
     Map<Integer, Integer> map = new HashMap<>();
     int[] ans = new int[2];

     for(int i = 0; i < arr.length; i++)
     {
        List<Integer> list = null;
        int num  = target - arr[i];
        if(!map.containsKey(num))
        {
           map.put(arr[i], i);
        }
        else
        {
          return new int[]{map.get(num), i};
        }
     }

     return new int[]{};
    }
}
