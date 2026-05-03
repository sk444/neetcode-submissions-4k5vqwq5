class Solution {
    public int[] plusOne(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int carry = 1;

        for(int i = arr.length-1; i >= 0; i--)
        {
            int num = arr[i] + carry;
    
             carry = num / 10;
             num = num % 10;
             

           stack.push(num);
           
        }
        if(carry != 0)
        stack.push(carry);

        
       

        int[] ans = new int[stack.size()];
        int k =0;
        while(!stack.isEmpty())
        {
         ans[k]=stack.pop();
         k++;
        }

        return ans;
        
    }
}
