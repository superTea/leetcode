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
 * @date Aug.13, 2014
 * @platform LeetCode OJ
 * 
 * 
 * 
 */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        return helper(root)>=0;
    }
    
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = helper(root.left);
        int right = helper(root.right);
        
        if(Math.abs(left-right)>1){
            return -1;
        }
        if(left<0 || right<0){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}