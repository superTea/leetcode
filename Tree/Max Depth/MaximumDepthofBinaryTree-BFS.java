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
     * Using breadth first of search(level traversal) to find the max depth of binary tree
     * 
     * @param TreeNode root, the root of tree
     * @return int level, the level of binary tree;
     */
     
     
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        int level = 0;
        int currlevel = 1;
        int nextlevel = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            currlevel--;
            if(node.left != null){
                queue.add(node.left);
                nextlevel++;
            }
            if(node.right != null){
                queue.add(node.right);
                nextlevel++;
            }
            if(currlevel == 0){
                currlevel = nextlevel;
                nextlevel = 0;
                level++;
            }
        }
        return level;
    }
}