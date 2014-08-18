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
     * Method of Preorder traversal using thread binary tree method
     * 
     * @param TreeNode root, the root of binary tree
     * @param TreeNode cur, the current pointer of TreeNode
     * @param TreeNode helper, the helper pointer of TreeNode
     * @return ArrayList<Integer> returnList
     */
     
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        if(root == null){
            return returnList;
        }
        TreeNode cur = root;
        TreeNode helper = null;
        
        while(cur != null){
            if(cur.left == null){
                returnList.add(cur.val);
                cur = cur.right;
            }else{
                helper = cur.left;
                while(helper.right != null && helper.right != cur){
                    helper = helper.right;
                }
                if(helper.right == null){
                    helper.right = cur;
                    returnList.add(cur.val);
                    cur = cur.left;
                }
                if(helper.right == cur){
                    helper.right = null;
                    cur = cur.right;
                }
            }
        }
        return returnList;
    }
}