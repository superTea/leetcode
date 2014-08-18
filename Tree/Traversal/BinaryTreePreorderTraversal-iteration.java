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
     * Method of Preorder traversal using iteration method
     * 
     * @param TreeNode root, the root of binary tree
     * @param stack, stack of TreeNode
     * @return ArrayList<Integer> returnList
     */
     
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        while(root !=null || !stack.isEmpty()){
            if(root != null){
                stack.push(root);
                returnList.add(root.val);
                root = root.left;
            }else{
                root = stack.pop();
                root = root.right;
            }
        }
        return returnList;
    }
}