class Solution {
    public int[] productExceptSelf(int[] arr)
    {
        int[] ans = new int[arr.length];

        int prod = 1;
        int index = -1;
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
             index = i;
             count++;
            }
            else
            {
             prod = prod * arr[i];
            }
        }

        if(count > 1)
        {
            Arrays.fill(ans, 0);
            return ans;
        }

        if(count == 1)
        {
            ans[index] = prod;
        }
        else
        {
          for(int i = 0; i < arr.length; i++)
          {
            ans[i] = prod/arr[i];
          }
        }
        return ans;
        
    }
}  
