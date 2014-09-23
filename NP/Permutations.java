/**
 * Given a collection of numbers, return all possible permutations.
 * For example
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * 
 * @see http://oj.leetcode.com/problems/permutations/
 * @author superTea
 * @date Sep 14th, 2014
 * @platform LeetCode OJ
 */
public class Solution {
    
    /**
     * Find the permutations of numbers using backtracking.
     * 
     * @param int[], target collection of numbers
     * @return ArrayList<ArrayList<Integer>>, all the permutations
     */
    public List<List<Integer>> permute(int[] num) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(num == null || num.length == 0){
            return returnList;
        }
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
            if(!used[i]){
                list.add(num[i]);
                used[i] = true;
                helper(num, used, list,returnList);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }
    }
    
}
