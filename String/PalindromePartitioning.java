public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 2, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<String>> partition(String s) {
       ArrayList<List<String>> returnList = new ArrayList<List<String>>();
       ArrayList<String> list = new ArrayList<String>();
       if(s.length() == 0 || s == null){
           return returnList;
       }
       helper(returnList, list, s);
       return returnList;
    }
    
    public void helper(ArrayList<List<String>> returnList, ArrayList<String> list, String s){
        if(s.length() == 0){
            returnList.add(new ArrayList<String>(list));
        }
        
        for(int i = 1; i <= s.length(); ++i){ // pay attention to this boundary
            String str = s.substring(0, i);
            if(isPalindrome(str)){
                list.add(str);
                String restStr = s.substring(i, s.length());
                helper(returnList, list, restStr);
                list.remove(list.size()-1);
            }
        }
    }
    
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
            if(s.charAt(left) != s. charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}