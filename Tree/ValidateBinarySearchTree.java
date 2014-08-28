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
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean helper(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
        
        if(root.val <= min || root.val >= max){
            return false;
        }
        
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}