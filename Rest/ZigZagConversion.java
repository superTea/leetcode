public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 22, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public String convert(String s, int nRows) {
        if(s == null || s.length() == 0 || nRows < 0){
            return "";
        }
        if(nRows == 1){
            return s;
        }
        int size = 2 * nRows - 2;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < nRows; i++){
            for(int j = i; j < s.length(); j += size){
                str.append(s.charAt(j));
                if(i != 0 && i != nRows - 1 && j+size-2*i<s.length()){
                    str.append(s.charAt(j + size - 2 * i));
                }
            }
        }
        return str.toString();
    }
}