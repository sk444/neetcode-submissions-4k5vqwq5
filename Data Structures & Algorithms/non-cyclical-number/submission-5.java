class Solution {
    public boolean isHappy(int n) 
    {
         Set<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n))
        {
            set.add(n);
            n = checkHappy(n);
        }

        return n == 1;
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
