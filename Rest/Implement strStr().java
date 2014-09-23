public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 18, 2014
     * @platoform LeetCode OJ
     * 
     */ 
    public String strStr(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length() == 0){
            return haystack;
        }
        
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.length() - i + 1 < needle.length()){
                return null;
            }
            
            int k = i;
            int j = 0;
            
            while(j < needle.length() && k < haystack.length() && needle.charAt(j) == haystack.charAt(k)){
                k++;
                j++;
                if(j == needle.length()){
                    return haystack.substring(i);
                }
            }
        }
        
        return null;
    }
}