public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 16, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(num == null || num.length == 0){
            return returnList;
        }
        Arrays.sort(num);
        helper(num, 0, target, new ArrayList<Integer>(), returnList);
        return returnList;
    }
    
    public void helper(int[] num, int start, int target, ArrayList<Integer>list, ArrayList<List<Integer>> returnList){
        if(target < 0){
            return;
        }
        
        if(target == 0){
            returnList.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = start; i < num.length; i++){
            if(i > start && num[i] == num[i - 1]) continue;
            list.add(num[i]);
            helper(num, i + 1, target-num[i],list,returnList);
            list.remove(list.size()-1);
        }
    }
}