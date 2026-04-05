class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max = 0;

        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        int startIndex = i;
       
        while(i < ch.length)
        {
           if(map.containsKey(ch[i]))
           {
           int index = map.get(ch[i]);
           startIndex = Math.max(startIndex, index + 1);
           map.put(ch[i], i);
           int length = i - startIndex; 
           max = Math.max(max, length+1);
          
           } 
          else
          {
            map.put(ch[i], i);
            int length = i - startIndex; 
            max = Math.max(max, length+1); 
          }
          
          
          i++;
        }

        return max;

        
    }
}
