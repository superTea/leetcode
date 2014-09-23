public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 22, 2014
     * @platoform LeetCode OJ
     * 
     */ 
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
             return "";
        }
        String returnStr = "";
        int max = 0;
        for(int i = 0; i < 2 * s.length() - 1; i++){
            int l = i / 2;
            int r = i / 2;
            if(i % 2 == 1){
                r++;
            } 
            String str = findLongest(s, l, r);
            if(str.length() > max){
                max = str.length();
                returnStr = str;
            }
        }
        return returnStr;
    }
    
    public String findLongest(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
        }
        
        return s.substring(l + 1, r);
    }
}