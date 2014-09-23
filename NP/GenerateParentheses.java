public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 21,2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<String> generateParenthesis(int n) {
        ArrayList<String> returnList = new ArrayList<String>();
        helper(n, n, "", returnList);
        return returnList;
    }
    
    public void helper(int l, int r, String item, ArrayList<String> returnList){
        if(r < l){
            return;
        }
        
        if(l == 0 && r == 0){
            returnList.add(item);
        }
        
        if(l > 0){
            helper(l - 1, r, item + "(" , returnList);
        }
        
        if(r > 0){
            helper(l, r - 1, item + ")", returnList);
        }
    }
}