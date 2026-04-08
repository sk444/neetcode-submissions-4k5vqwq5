class Solution {
    public int evalRPN(String[] arr) 
    {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals("+")  && !stack.isEmpty())
            { 
                int curr = 0;
                int b = stack.pop();
                int a = stack.pop();

                curr = a + b;
                
                stack.push(curr);
            }
            else if(arr[i].equals("*")  && !stack.isEmpty())
            {   
               int b = stack.pop();
               int a = stack.pop();

               int curr = a * b;
               stack.push(curr);
            }
            else if(arr[i].equals("-") && !stack.isEmpty())
            {
                int b = stack.pop();
                int a = stack.pop();
                int curr = a - b;
                stack.push(curr); 
            }
            else if(arr[i].equals("/")  && !stack.isEmpty())
            {
                int b = stack.pop();
                int a = stack.pop();
                int curr = a / b;
                stack.push(curr);
            }
            else
            {
                stack.push(Integer.parseInt(arr[i]));
            }
        }
        return stack.pop();
        
    }
}
