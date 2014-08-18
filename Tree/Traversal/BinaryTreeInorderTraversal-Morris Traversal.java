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
     * Method to inorder traverse a binary tree using thread binary tree
     * 
     * @param TreeNode root, the root of the tree
     * @param TreeNode cur, the curent pointer of treenode
     * @param TreeNode helper, the helper pointer of treenode
     * @return ArrayList<Integer> resultList
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        TreeNode cur = root;
        TreeNode helper = null;
        
        while(cur != null){
            if(cur.left == null){
                returnList.add(cur.val);
                cur = cur.right;
            }else{
                helper = cur.left;
                while(helper.right !=null && helper.right != cur){
                    helper = helper.right;
                }
                if(helper.right == null){
                    helper.right = cur;
                    cur = cur.left;
                }
                if(helper.right == cur){
                    helper.right = null;
                    returnList.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return returnList;
    }
}