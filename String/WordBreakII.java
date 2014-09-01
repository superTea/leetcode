public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 1st, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<String> wordBreak(String s, Set<String> dict) {
        ArrayList<String> list = new ArrayList<String>();
        if(s.length() == 0 || s == null){
            return list;
        }
        helper(s, dict, 0, "", list);
        return list;
    }
    
    public void helper(String s, Set<String> dict, int left, String part, ArrayList<String> list){
        if(left >= s.length()){
            list.add(part);
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = left; i < s.length(); i++){
            sb.append(s.charAt(i));
            if(dict.contains(sb.toString())){
                String newParts = part.length()>0? (part+" "+sb.toString()):sb.toString();
                helper(s, dict, i+1, newParts, list);
            }
        }
    }
}