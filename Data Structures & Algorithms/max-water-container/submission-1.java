class Solution {
    public int maxArea(int[] arr) 
    {
        int low = 0;
        int high = arr.length-1;

        int maxArea = 0; 

        while(low < high)
        {
            int area = Math.min(arr[low], arr[high])*(high-low);

            maxArea = Math.max(area, maxArea);

            if (arr[low] < arr[high]) {
                low++;
            } else {
                high--;
            }
        }

        return maxArea;
     
    }
}
