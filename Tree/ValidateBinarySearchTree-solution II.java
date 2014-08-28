/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * 
 * @author superTea
 * @date Aug.27, 2014
 * @platform LeetCode OJ
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        ArrayList<TreeNode> pre = new ArrayList<TreeNode>();
        pre.add(null);
        return helper(root, pre);
    }
    
    public boolean helper(TreeNode root, ArrayList<TreeNode> pre){
        if(root == null){
            return true;
        }
        
        boolean left = helper(root.left, pre);
        if(pre.get(0) != null && pre.get(0).val >= root.val){
            return false;
        }
        pre.set(0,root);
        return left && helper(root.right, pre);
    }
}