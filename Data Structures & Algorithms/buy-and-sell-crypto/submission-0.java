class Solution {
    public int maxProfit(int[] arr)
    {
        int max = 0;

        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                int currProfit = arr[j]-arr[i];
                max = Math.max(max, currProfit);
            }
        }
        return max;
    }
}
