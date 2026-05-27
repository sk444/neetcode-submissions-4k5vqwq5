class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max = 0;

        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        int endIndex = 0;
        int startIndex = 0;
       
        while(endIndex < ch.length)
        {
           if(map.containsKey(ch[endIndex]))
           {
           int index = map.get(ch[endIndex]);
           startIndex = Math.max(startIndex, index + 1);
           } 
         
            map.put(ch[endIndex], endIndex);
            int length = endIndex - startIndex + 1; 
            max = Math.max(max, length); 
            endIndex++;
        }

        return max;

        
    }
}
