public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 11, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int[][] table = new int[grid.length][grid[0].length];
        table[0][0] = grid[0][0];
        for(int i = 1; i < grid.length; i++){
            table[i][0] = table[i-1][0] + grid[i][0];
        }
        for(int i = 1; i < grid[0].length; i++){
            table[0][i] = table[0][i-1] + grid[0][i];
        }
        
        for(int i = 1; i < grid.length; i++){
            for(int j = 1; j < grid[0].length; j++){
                table[i][j] = Math.min(table[i-1][j], table[i][j-1]) + grid[i][j];
            }
        }
        
        return table[grid.length-1][grid[0].length-1];
    }
}