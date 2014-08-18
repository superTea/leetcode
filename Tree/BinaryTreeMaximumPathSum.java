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
 * @date Aug.12, 2014
 * @platform LeetCode OJ
 */
public class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE};
        helper(root, max);
        return max[0];
    }
    
    public int helper(TreeNode root, int[] max){
        if(root == null){
            return 0;
        }
        
        int maxleft = helper(root.left, max);
        int maxright = helper(root.right, max);
        /**
         * 
         * Four situations: left + node, right + node, node, right + left + node
         * 
         */
         
         int temp1 = Math.max(root.val, Math.max(maxleft + root.val, maxright + root.val));
         max[0] = Math.max(max[0], Math.max(temp1, root.val + maxleft + maxright));
         return temp1;
    }
}