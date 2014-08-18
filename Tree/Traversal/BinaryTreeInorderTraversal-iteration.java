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
     * Method to inorder traverse a binary tree using iteration
     * 
     * @param TreeNode, the root of the tree
     * @param List of TreeNode
     * @return ArrayList<Integer> resultList
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        while(root !=null || !stack.isEmpty()){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                root = stack.pop();
                returnList.add(root.val);
                root = root.right;
            }
        }
        return returnList;
    }
}