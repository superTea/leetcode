public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 6, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public boolean exist(char[][] board, String word) {
       if(word.length() == 0 || word == null){
           return true;
       }
       if(board.length == 0 || board == null || board[0].length == 0){
           return false;
       }
       
       boolean[][] used = new boolean[board.length][board[0].length];
       for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board[0].length; j++){
                if(helper(board, word, i, j, 0, used)){
                    return true;
                }
           }
       }
       
       return false;
    }
    
    public boolean helper(char[][] board, String word, int row, int col, int index, boolean[][] used){
        if(index == word.length()){
            return true;
        }
        
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || word.charAt(index) != board[row][col] || used[row][col]){
            return false;
        }
        
        used[row][col] = true;
        boolean result = helper(board, word, row + 1, col, index+1, used) || helper(board, word, row -1, col, index + 1, used) || helper(board, word, row, col + 1, index + 1, used) || helper(board, word, row, col - 1, index + 1, used);
        used[row][col] = false;
        
        return result; 
    }
}