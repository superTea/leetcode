public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 11, 2014
     * @platform LeetCoe OJ
     * 
     */ 
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null){
            return 0;
        }
        
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] table = new int[row][col];
        
        for(int i = 0; i < row; i++){
            if(obstacleGrid[i][0] == 0){
                table[i][0] = 1;
            }else{
                table[i][0] = 0;
                break;
            }
        }
        
        for(int j = 0; j < col; j++){
            if(obstacleGrid[0][j] == 0){
                table[0][j] = 1;
            }else{
                table[0][j] = 0;
                break;
            }
        }
        
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(obstacleGrid[i][j] == 0){
                  table[i][j] = table[i-1][j] + table[i][j-1];
                }
            }
        }
        
        return table[row-1][col-1];
    }
}