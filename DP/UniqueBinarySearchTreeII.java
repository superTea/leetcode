/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 * 
 * 
 * @author superTea
 * @date Aug.27, 2014
 * @platform LeetCode OJ
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);
    }
    
    public List<TreeNode> helper(int start, int end){
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        
        if(start > end){
            list.add(null);
            return list;
        }
        
        for(int i =start; i <= end; i++){
            List<TreeNode> lefts = helper(start, i-1);
            List<TreeNode> rights = helper(i+1, end);
            for(TreeNode left:lefts){
                for(TreeNode right:rights){
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    list.add(node);
                }
            }
        }
        return list;
    }
}