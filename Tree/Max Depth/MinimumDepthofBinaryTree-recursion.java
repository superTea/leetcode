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
 * @date Aug.12th, 2014
 * @platform LeetCode OJ
 * 
 * 
 */
public class Solution {
    /**
     * 
     * Using recursion to find the minimum depth of Binary Tree
     * 
     * @param TreeNode root, the root of tree
     * @return int depth
     * 
     */ 
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return minDepth(root.right)+1;
        }
        if(root.right == null){
            return minDepth(root.left)+1;
        }
        int depth = Math.min(minDepth(root.right),minDepth(root.left))+1;
        return depth;
    }
}