class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0) && solver(board, word, i, j, 0)){ //a 
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean solver(char[][] board, String word, int i, int j, int count) {
        if (count == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length||board[i][j]==' ' || word.charAt(count)!=board[i][j]) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = solver(board, word, i + 1, j, count + 1) ||
                solver(board, word, i - 1, j, count + 1) ||
                solver(board, word, i, j + 1, count + 1) ||
                solver(board, word, i, j - 1, count + 1);
        board[i][j] = temp;
        return found;
    }
}