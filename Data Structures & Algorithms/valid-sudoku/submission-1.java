class Solution {
    public boolean isValidSudoku(char[][] arr) 
    {
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[0].length; col++)
            {
                if(arr[row][col] != '.')
                {
                        if(!isValid(arr, row, col, arr[row][col]))
                        {
                            return false;
                        }
                }

            }
        }
        return true;
        
    }

    private boolean isValid(char[][] board,
                            int row,
                            int col,
                            char num) {

        for(int i = 0; i < 9; i++) {

            if(i != col && board[row][i] == num) {
                return false;
            }

            if(i != row && board[i][col] == num) {
                return false;
            }

            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if(boxRow != row && boxCol != col && board[boxRow][boxCol] == num)
            {
                return false;
            }
        }

        return true;
    }


}
