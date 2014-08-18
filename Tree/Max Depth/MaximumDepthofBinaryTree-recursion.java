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
 * @date July 12th, 2014
 * @platform LeetCode OJ
 */
public class Solution {
    /**
     * 
     * Using recursion to find the max depth of binary tree
     * 
     * @param TreeNode root, the root of tree
     * @param int leftHeight, the height of left children of tree
     * @param int rightHeight, the height of right children of tree
     * @return int depth, the max depth of tree
     */
     
     
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        
        int depth = Math.max(leftHeight,rightHeight) + 1;
        return depth;
    }
}