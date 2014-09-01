public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 1, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public boolean wordBreak(String s, Set<String> dict) {
        if(s.length() == 0 || s == null){
            return true;
        }
        
        boolean[] table = new boolean[s.length()+1];
        table[0] = true;
        for(int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder(s.substring(0,i+1)); // initial specific string
            for(int j = 0; j <=i; j++){
                if(table[j] && dict.contains(sb.toString())){
                    table[i+1] = true;
                    break;
                }
                sb.deleteCharAt(0);
            }
        }
        
        return table[s.length()];
    }
}