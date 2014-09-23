public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 16, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0){
            return returnList;
        }
        Arrays.sort(candidates);
        helper(candidates, 0, target, new ArrayList<Integer>(), returnList);
        return returnList;
    }
    
    public void helper(int[] candidates, int start, int target, ArrayList<Integer> list, ArrayList<List<Integer>> returnList){
        if(target < 0){
            return;
        }
        
        if(target == 0){
            returnList.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = start; i < candidates.length; i++){
            if(i > 0 && candidates[i] == candidates[i - 1]) continue;
            list.add(candidates[i]);
            helper(candidates, i, target - candidates[i], list, returnList);
            list.remove(list.size() - 1);
        }
    }
    
}