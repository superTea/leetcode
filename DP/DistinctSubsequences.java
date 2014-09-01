public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Aug 29, 2014
     * @platform LeetCode OJ
     * 
     */
     
    public int numDistinct(String S, String T) {
        if(T.length() == 0){
            return 1;
        }
        int[] table = new int[T.length()+1];
        table[0] = 1;
        for(int i = 0; i<S.length(); i++){
            for(int j = T.length()-1; j >= 0; j--){
                table[j+1] = (S.charAt(i) == T.charAt(j)?table[j]:0) + table[j+1];
            }
        }
        
        return table[T.length()];
    }
}