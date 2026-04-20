class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length()) return false;

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       String ans1 = new String(ch1);
       String ans2 = new String(ch2);

       return ans1.equals(ans2);

    }
}
