/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * @author superTea
 * @date Aug.15, 2014
 * @platform LeetCode OJ
 * 
 * 
 * 
 * 
 * Please refer the solution on http://blog.csdn.net/fightforyourdream/article/details/12865895
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(root == null){
            return returnList;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(root, sum, returnList, list);
        return returnList;
    }
    
    public void helper(TreeNode root, int sum, ArrayList<List<Integer>> returnList, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null && root.val == sum){
            list.add(root.val);
            ArrayList<Integer> copy = new ArrayList<Integer>(list); // copy array to prevent any change when come back
            returnList.add(copy);
            list.remove(list.size()-1);
            return;
        }
        
        if(root.left != null){
            list.add(root.val);
            helper(root.left, sum-root.val, returnList, list);
            list.remove(list.size()-1);
        }
        
        if(root.right != null){
            list.add(root.val);
            helper(root.right, sum-root.val,returnList,list);
            list.remove(list.size()-1);
        }
    }
}