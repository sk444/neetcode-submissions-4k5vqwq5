class Solution {
    public int lastStoneWeight(int[] arr)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);

        for(int i = 0; i < arr.length; i++)
        {
            pq.offer(arr[i]);

        }
         while(pq.size() > 1)
         {
            int x = pq.poll();
            int y = pq.poll();

           if(x != y)
           {
             pq.offer(x - y);
           }

         }
         return pq.size() == 0 ? 0: pq.peek();
    }
}
