class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max = 0;

        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        // key --> character, value --> first seen index
        int i = 0;
        int startIndex = i;
       
        while(i < ch.length)
        {
           
          if(!map.containsKey(ch[i]))
          {
             map.put(ch[i], i);
            int length = i - startIndex; 
            max = Math.max(max, length+1); 
          }
          else
          {
           int length = i - startIndex; 
           max = Math.max(max, length);
           int index = map.get(ch[i]);
           startIndex = Math.max(startIndex, index + 1);
           map.put(ch[i], i);
          }
          i++;
        }

        return max;

        
    }
}
