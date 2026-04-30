class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length() > s2.length()) return false;

        List<String> list = new ArrayList<>();

        char[] ch2 = s1.toCharArray();

        Arrays.sort(ch2);

        for(int i = 0; i <= s2.length() - s1.length(); i++)
        {
          String str = s2.substring(i, i + s1.length());


           char[] ch1 = str.toCharArray();

           Arrays.sort(ch1);

           String rr = new String(ch1);

           String pp = new String(ch2);


            if(rr.equals(pp))
            {
               return true; 
            }
        }
        return false;  
    }
}
