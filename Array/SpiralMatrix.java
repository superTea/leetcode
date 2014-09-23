public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 11, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int[][] generateMatrix(int n) {
        if(n < 0){
            return null;
        }
        int num = 1;
        int[][] table = new int[n][n];
        int numlevel = n / 2;
        for(int l = 0; l < numlevel; l++){
            for(int i = l; i < n - l; i++){
                table[l][i] = num++;
            }
            for(int i = l + 1; i < n - l; i++){
                table[i][n - 1 - l] = num++;
            }
            for(int i = n - 2 - l; i >= l; i--){
                table[n - 1 - l][i] = num++;
            }
            for(int i = n - 2 - l; i > l ; i--){
                table[i][l] = num++;
            }
        }
        
        if(n % 2 == 1){
            table[numlevel][numlevel] = num;
        }
        
        return table;
    }
}