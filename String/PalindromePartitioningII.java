public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 3, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int minCut(String s) {
       if(s.length() == 0 || s == null){
           return 0;
       }
       boolean[][] dict = getDict(s);
       int[] table = new int[s.length()+1];
       table[0] = 0;
       for(int i = 0; i < s.length(); i++){
            table[i+1] = i + 1;
            for(int j = 0; j <= i; j++){
                if(dict[j][i]){
                    table[i+1] = Math.min(table[i+1],table[j]+1);
                }
            }
       }
       return table[s.length()]-1;
    }
    
    public boolean[][] getDict(String s){
        boolean[][] dict  = new boolean[s.length()][s.length()];
        for(int i = s.length() - 1; i >= 0; i--){
            for(int j = i; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j) && (j - i < 2 || dict[i+1][j-1])){
                    dict[i][j] = true;
                }
            }
        }
        
        return dict;
    }
}