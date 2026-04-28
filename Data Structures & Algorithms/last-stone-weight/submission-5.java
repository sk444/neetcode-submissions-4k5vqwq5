class Solution {
    public int lastStoneWeight(int[] arr)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);

        for(int i = 0; i < arr.length; i++)
        {
            pq.offer(arr[i]);

        }
         while(pq.size() != 0)
         {
            if(pq.size() == 1) return pq.peek();

           
               int x = pq.poll();
               int y = pq.poll();

              pq.offer(x - y);

            
         }
         return 0;
        
    }
}
