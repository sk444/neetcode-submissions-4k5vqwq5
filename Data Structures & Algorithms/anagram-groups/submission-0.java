class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++)
        {
            char[] ch = strs[i].toCharArray();

            Arrays.sort(ch);


            String ss = new String(ch);

            if(map.containsKey(ss))
            {
                List<Integer> list = new ArrayList<>();

                map.get(ss).add(i);
            }
            else
            {
                List<Integer> list = new ArrayList<>();
                 list.add(i);

                map.put(ss, list);
            }
        }
        List<List<String>> ans = new ArrayList<>();

        for(Map.Entry<String, List<Integer>> entry : map.entrySet())
        {
           List<String> list1 = new ArrayList<>();

           List<Integer> list11 = entry.getValue();

           for(int i = 0; i < list11.size(); i++)
           {
            list1.add(strs[list11.get(i)]);
           }
           ans.add(list1);
        }

        return ans;
    }
}
