class Solution {
    int max = 0;

    public int maxAreaOfIsland(int[][] arr) 
    {
        int[] dX = {1, 0, -1, 0};
        int[] dY = {0, 1, 0, -1};


        boolean[][] visited = new boolean[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
               if(arr[i][j] == 1 && !visited[i][j])
               {
                   visited[i][j]=true;
                   int count = dfs(arr, i, j, dX, dY, visited);
                   max = Math.max(max, count);
               }
            }
        }
        return max;
    }

    private int dfs(int[][] arr, int x, int y, int[] dX, int[] dY, 
    boolean[][] visited)
    {
        int count = 1;
        for(int i = 0; i < dX.length; i++)
        {
            int newX = x + dX[i];
            int newY = y + dY[i];

            if(newX < 0 || newY < 0 || newX >= arr.length || newY >= arr[0].length ||
             arr[newX][newY] == 0 || visited[newX][newY])
             {
                continue;
             }
             visited[newX][newY]=true;
             
             count = count + dfs(arr, newX, newY, dX, dY, visited);            
        }
        return count;

    }
}
