public class Solution {
    /**
     * 
     * Dynamic Programming
     * @author superTea
     * @date Aug.27, 2014
     * @platform LeetCode OJ
     * 
     */
     
    public int numTrees(int n) {
        if(n <= 0 ){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }
        
        //table[i], number of trees that store 1****n
        int[] table = new int[n+1];
        table[0] = 1;
        table[1] = 1;
        
        
        for(int i = 2; i <= n; i++){
            for(int j = 0; j<i; j++){
                table[i] += table[j]*table[i-j-1];
            }
        }
        
        return table[n];
    }
}