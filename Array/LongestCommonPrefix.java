public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 22, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        if(strs == null || strs.length == 0){
            return str.toString();
        }
        int index = 0;
        boolean same = true;
        while(same){
            for(int i = 0; i < strs.length; i++){
                if(strs[i].length() <= index || strs[i].charAt(index) != strs[0].charAt(index)){
                    same = false;
                    break;
                }
            }
            if(same){
                str.append(strs[0].charAt(index));
            }
            index++;
        }
        return str.toString();
    }
}