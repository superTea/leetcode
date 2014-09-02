/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * 
     * @author superTea
     * @date Sep 2, 2014
     * @platform LeetCode OJ
     * 
     */ 
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    
    public int helper(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return root.val + 10*sum;
        }
        
        return helper(root.left, 10 * sum + root.val) + helper(root.right, 10 * sum + root.val);
    }
}