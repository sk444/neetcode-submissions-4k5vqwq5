class Solution {
    public int numIslands(char[][] arr) 
    {
        int n = arr.length;
        int[] dX = {1, 0, -1, 0};
        int[] dY = {0, 1, 0, -1};

        int count = 0;

        boolean[][] visited = new boolean[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                if(arr[i][j] == '1' && !visited[i][j])
                {
                  visited[i][j] = true;  
                  
                  dfs(arr, i, j, visited, dX, dY);
                  count++;
                }
                
            }
        } 
        return count;
    }

    private void dfs(char arr[][], int x, int y, boolean[][] visited, 
    int[] dX, int[] dY)
    {
        for(int i = 0; i < dX.length; i++)
        {
           int newX = x + dX[i];
           int newY = y + dY[i];

            if(newX < 0 || newY < 0 || newX >= arr.length || newY >= arr[0].length || arr[newX][newY] == '0' || visited[newX][newY])
            {
             continue;
            }
            visited[newX][newY]=true;
            dfs(arr, newX, newY, visited, dX, dY);
        }
    }
}
