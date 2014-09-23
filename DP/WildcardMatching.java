public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 17, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public boolean isMatch(String s, String p) {
        if(p.length()==0)  
        return s.length()==0;  
        boolean[] table = new boolean[s.length()+1];
        table[0] = true;
        
        for(int i = 0; i < p.length(); i++){
            
            if(p.charAt(i) != '*'){
                for(int j = s.length() - 1; j >= 0; j--){
                   table[j + 1] = table[j] && (p.charAt(i) == '?' || p.charAt(i) == s.charAt(j));
                }
            }else{
                int j = 0;
                while(j <= s.length() && !table[j]){
                    j++;
                }
                while(j <= s.length()){
                    table[j] = true;
                    j++;
                }
            }
            table[0] = table[0] && p.charAt(i) == '*';
        }
        return table[s.length()];
    }
}