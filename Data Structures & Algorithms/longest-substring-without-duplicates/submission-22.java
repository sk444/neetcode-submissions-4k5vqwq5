class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
       int maxLength = 0;
       int startIndex = 0;
       int endIndex = 0;

       Map<Character, Integer> map = new HashMap<>();

       char[] ch = s.toCharArray();

       while(endIndex < s.length())
       {
          if(map.containsKey(ch[endIndex]))
          {
            int index = map.get(ch[endIndex]);
            startIndex = Math.max(startIndex, index+1);
          }

          map.put(ch[endIndex], endIndex);
          maxLength = Math.max(maxLength, endIndex-startIndex+1);
          endIndex++;
       }
        return maxLength;

        
    }
}
