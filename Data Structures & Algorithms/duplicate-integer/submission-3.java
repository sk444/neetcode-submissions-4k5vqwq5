class Solution {
    public boolean hasDuplicate(int[] arr)
    {
      Set<Integer> set = new HashSet<>();

      List<Integer> ans 
      = Arrays.stream(arr).boxed()
      .filter(num -> !set.add(num)).collect(Collectors.toList());

      return ans.size() > 0;
        
    }
}