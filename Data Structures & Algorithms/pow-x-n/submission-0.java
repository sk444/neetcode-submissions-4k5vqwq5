class Solution {
    public double myPow(double x, int n)
    {
        double ans = 1.00000;
        if(n < 0)
        {
            x = 1/x;

            n = -1 * n;
        }
        for(int i = 0; i < n; i++)
        {
            ans = ans * x;

        }
        return ans;
        
    }
}
