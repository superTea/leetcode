public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 17, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0){
            return false;
        }
        
        for(int i = 0; i < 9; i++){
            boolean[] check = new boolean[9];
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(check[(int)(board[i][j] - '1')]){
                        return false;
                    }
                    check[(int)(board[i][j] - '1')] = true;
                }
            }
        }
        
        for(int j = 0; j < 9; j++){
            boolean[] check = new boolean[9];
            for(int i = 0; i < 9; i++){
                if(board[i][j] != '.'){
                    if(check[(int)(board[i][j] - '1')]){
                        return false;
                    }
                    check[(int)(board[i][j] - '1')] = true;
                }
            }
        }
        
        for(int x = 0; x < 9; x++){
            boolean[] check = new boolean[9];
            for(int i = x / 3 * 3; i < x / 3 * 3 + 3; i++){
                for(int j = x % 3 * 3; j < x %3 * 3 + 3; j++){
                    if(board[i][j] != '.'){
                        if(check[(int)(board[i][j] - '1')]){
                            return false;
                        }
                        check[(int)(board[i][j] - '1')] = true;
                    }
                }
            }
        }
        return true;
    }
}