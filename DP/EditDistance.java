public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 9, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int minDistance(String word1, String word2) {
        if(word1 == null || word2 == null){
            return 0;
        }
        
        int len1 = word1.length();
        int len2 = word2.length();
        
        int[][] table = new int[len1 + 1][len2 + 1];
        for(int i = 0; i <= len1; i++){
            table[i][0] = i;
        }
        
        for(int i = 0; i <= len2; i++){
            table[0][i] = i;
        }
        
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    table[i + 1][j + 1] = table[i][j];
                }else{
                    int insert = table[i + 1][j] + 1;
                    int replace = table[i][j] + 1;
                    int delete = table[i][j + 1] + 1;
                    
                    int min = insert > replace ? replace : insert;
                    min = delete > min ? min : delete;
                    table[i + 1][j + 1] = min;
                }
            }
        }
        
        return table[len1][len2];
    }
}