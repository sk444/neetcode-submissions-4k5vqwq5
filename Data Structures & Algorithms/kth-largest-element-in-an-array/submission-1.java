class Solution {
    public int findKthLargest(int[] arr, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

       for(int i = 0; i < arr.length; i++)
       {
          pq.offer(arr[i]);
       }

       for(int i = 1; i <=k; i++)
       {
        if(i == k)
        return pq.poll();
        pq.poll();
       }
       return -1;
        
    }
}
