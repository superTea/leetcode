/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }sh
 * 
 * @author superTea
 * @date Aug.11th, 2014
 * @platform leetcode OJ
 * 
 * 
 * Running time complexity is O(n);
 * 
 */
public class Solution {
    /**
     * Method to inorder traverse a binary tree
     * 
     * @param TreeNode, the root of the tree
     * @return ArrayList<Integer> resultList
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        helper(root, returnList);
        return returnList;
    }
    
    public void helper(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }
}