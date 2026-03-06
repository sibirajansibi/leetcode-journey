import java.util.*;

class Solution {
    List<List<String>> results = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
                
        backtrack(0, board, n);
        return results;
    }

   
    private void backtrack(int row, char[][] board, int n) {
        if (row == n) {
            results.add(build(board));
            return;
        }

        int col = 0;
        while (col < n) {
            if (isSafe(row, col, board)) {
                placeQueen(board, row, col);
                backtrack(row + 1, board, n);
                removeQueen(board, row, col);
            }
            col++;
        }
    }

private boolean isSafe(int row, int col, char[][] board) {
    int n = board.length;

    // Check column
    for (int i = 0; i < row; i++) {
        if (board[i][col] == 'Q') return false;
    }

    // Check top-left diagonal
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') return false;
    }

    // Check top-right diagonal ✅
    for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
        if (board[i][j] == 'Q') return false;
    }

    return true; 
}


    

  
    public void placeQueen(char[][] board, int row, int col) {
        board[row][col] = 'Q';
    }

    
    public void removeQueen(char[][] board, int row, int col) {
        board[row][col] = '.';
    }

 
    private List<String> build(char[][] board) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < board.length) {
            res.add(new String(board[i]));
            i++;
        }
        return res;
    }
}


   

