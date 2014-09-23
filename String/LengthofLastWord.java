public class Solution {
    /**
     * 
     * @author superTea
     * @date LeetCode OJ
     * @platform LeetCode OJ
     * 
     */ 
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        StringBuilder str = new StringBuilder();
        boolean start = false;
        for(int i = s.length() - 1; i >= 0 ; i--){
            if(start == true){
                if(s.charAt(i) != ' ' && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                    str.append(s.charAt(i));
                }else{
                    break;
                }
            }else{
                if(s.charAt(i) != ' ' && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                    str.append(s.charAt(i));
                    start = true;
                }
            }
        }
        
        return str.length();
    }
}