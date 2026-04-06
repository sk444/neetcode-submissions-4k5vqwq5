class Solution {
    public boolean isValid(String s) 
    {
       char[] ch = s.toCharArray();
       Stack<Character> stack = new Stack<>();

       for(int i = 0; i < ch.length; i++)
       {
          if(ch[i] == '(' || ch[i] == '{' || ch[i] == '[')
          {
            stack.push(ch[i]);
          }
          else
          {
             if(stack.isEmpty()) return false;

             if(ch[i] == ')' && stack.peek() == '(' 
                || ch[i] == '}' && stack.peek() == '{'
                 || ch[i] == ']' && stack.peek() == '[')
            {
               stack.pop();
            }
            else
            {
                return false;
            }
          }
       }
       if(!stack.isEmpty()) return false;

       return true;
        
    }
}
