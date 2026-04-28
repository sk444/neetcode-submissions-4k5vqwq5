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

            if(pq.size() >= 2)
            {
               int x = pq.poll();
               int y = pq.poll();

               if(x < y)
               {
                y = y-x;
                pq.offer(y);
               }
               else if(x > y)
               {
                x = x - y;
                pq.offer(x);
               }

            }
         }
         return 0;
        
    }
}
