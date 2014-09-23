public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 7, 2014
     * @platorm LeetCode OJ
     * 
     */ 
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(n <= 0 || n < k){
            return returnList;
        }
        helper(n, k, 1, returnList, new ArrayList<Integer>());
        return returnList;
    }
    
    public void helper(int n, int k, int num, ArrayList<List<Integer>> returnList, ArrayList<Integer> list){
        if(list.size() == k){
            returnList.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = num; i <= n; i++){
            list.add(i);
            helper(n, k, i + 1, returnList, list);
            list.remove(list.size()-1);
        }
    }
}