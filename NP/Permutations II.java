public class Solution {
    /**
     * 
     * 
     * @author superTea
     * @date Sep 14, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public List<List<Integer>> permuteUnique(int[] num) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(num == null || num.length == 0){
            return returnList;
        }
        Arrays.sort(num);
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean[] used = new boolean[num.length];
        helper(num, used, list, returnList);
        return returnList;
    }
    
    public void helper(int[] num, boolean[] used, ArrayList<Integer> list, ArrayList<List<Integer>> returnList){
        if(list.size() == num.length){
            returnList.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = 0; i < num.length; i++){
            if(i > 0 && !used[i - 1] && num[i - 1] == num[i]){
                continue;
            }
            if(!used[i]){
                used[i] = true;
                list.add(num[i]);
                helper(num, used, list, returnList);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }
    }
}