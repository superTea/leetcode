public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 4, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> list = new ArrayList<String>();
        if(s.length() == 0 || s == null){
            return list;
        }
        helper(s, 0, 1, "", list);
        return list;
    }
    
    public void helper(String s, int index, int segment, String str, ArrayList<String> list){
        if(index >= s.length()){
            return;
        }
        
        if(segment == 4){
            String temp = s.substring(index);
            if(isValid(temp)){
                list.add(str + "." + temp);
            }
            return;
        }
        
        for(int i = 1; i < 4 && (i + index <= s.length()); i++){
            String temp = s.substring(index, index + i);
            if(isValid(temp)){
                if(segment == 1){
                    helper(s, index + i, segment + 1, temp, list);
                }else{
                    helper(s, index + i, segment + 1, str + "." + temp, list);
                }
            }
        }
        
    }
    
    public boolean isValid(String str){
        if(str.length() > 3 || str == null){
            return false;
        }
        if(str.charAt(0) == '0' && str.length() > 1){
            return false;
        }
        int num = Integer.parseInt(str);
        if(num < 0 || num > 255){
            return false;
        }
        return true;
    }
}