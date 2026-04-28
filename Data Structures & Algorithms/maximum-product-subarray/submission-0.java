class Solution {
    public int maxProduct(int[] arr)
    {
        int maxProd = Integer.MIN_VALUE;

        int currProd = 1;

       for(int i = 0; i < arr.length; i++)
       {
        currProd = arr[i];

        maxProd = Math.max(currProd, maxProd);

        for(int j = i+1; j < arr.length; j++)
        {
         currProd = currProd * arr[j];
         maxProd = Math.max(maxProd, currProd);
        }
       }
       return maxProd;
        
    }
}
