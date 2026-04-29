class Solution {
    public boolean isHappy(int n) 
    {
        Set<Integer> set = new HashSet<>();
        
        boolean flag = true;

        while(flag)
        {
          int temp = checkHappy(n);
          if(temp == 1)
          {
            return true;
          }
          else if(set.contains(temp))
          {
            return false;
          }
          else
          {
            set.add(temp);
            n = temp;

          }
        }
        return false;
    }

    private int checkHappy(int n)
    {
        int sum = 0;

        while(n != 0)
        {
            int digit = n % 10;

            sum = sum + (digit * digit) ;
            
            n = n/10;
        }
        return sum;
    }
}
