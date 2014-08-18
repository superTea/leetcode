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
     * Using BFS to find the minimum depth of Binary Tree
     * 
     * @param TreeNode root, the root of tree
     * @return int level
     * 
     */ 
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 1;
        int curlevel = 1;
        int nextlevel = 0;
        
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left == null && node.right == null){
                return level;
            }
            curlevel--;
            if(node.left != null){
                queue.add(node.left);
                nextlevel++;
            }
            if(node.right != null){
                queue.add(node.right);
                nextlevel++;
            }
            if(curlevel == 0){
                curlevel = nextlevel;
                nextlevel = 0;
                level++;
            }
        }
        return 0;
    }    
}