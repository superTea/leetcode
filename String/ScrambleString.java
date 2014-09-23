public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 4, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public boolean isScramble(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        
        if(s1.equals(s2)){
            return true;
        }
        
        for(int i = 1; i < s1.length(); ++i){
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i);
            String s21 = s2.substring(0,i);
            String s22 = s2.substring(i);
            if(isScramble(s11, s22) && isScramble(s21, s12)){
                return true;
            }else if(isScramble(s11,s21) && isScramble(s12, s22)){
                return true;
            }
        }
        
        return false;
    }
}