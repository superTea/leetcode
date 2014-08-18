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
 * @date Aug.11th, 2014
 * @platform LeetCode OJ
 */
public class Solution {
    /**
     * 
     * 
     * Method of inorder traversal using recursion method
     * 
     * @param TreeNode root, the root of binary tree
     * @return ArrayList<Integer> returnList;
     */ 
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        helper(root, returnList);
        return returnList;
    }
    
    public void helper(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}