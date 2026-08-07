class Solution {
    public int trap(int[] height) 
    {
        int[] leftMaxArray = new int[height.length];
        int[] rightMaxArray = new int[height.length];

        int maxLeft = height[0];

        leftMaxArray[0]=height[0];

        for(int i = 1; i < height.length; i++)
        {
            if(maxLeft < height[i])
            {
                maxLeft = height[i];
                leftMaxArray[i]=height[i];
            }
            else
            {
              leftMaxArray[i]=maxLeft;  
            }
        }

        int maxRight = height[height.length-1];
            rightMaxArray[height.length-1] = maxRight;

        for(int i = height.length-2; i >=0; i--)
        {
            if(maxRight < height[i])
            {
              maxRight = height[i];
              rightMaxArray[i] = maxRight;
            }
            else
            {
              rightMaxArray[i]=maxRight;  
            }
        }  

        int sum = 0;
        for(int i = 0; i < height.length; i++)
        {
           sum = sum+Math.min(leftMaxArray[i], rightMaxArray[i])-height[i];
        }  

        return sum; 
    }
}
