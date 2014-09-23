public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 8, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        
        boolean rowflag = false;
        boolean colflag = false;
        
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                rowflag = true;
            }
        }
        
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                colflag = true;
            }
        }
        
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(rowflag){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        
        if(colflag){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        
    }
}