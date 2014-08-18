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
     * Method to postorder traverse a binary tree using iteration
     * 
     * @param TreeNode, the root of the tree
     * @param List of TreeNode
     * @return ArrayList<Integer> resultList
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        TreeNode pre = null;
        TreeNode cur = null;
        if(root == null){
            return returnList;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            cur = stack.peek();
            if(pre == null || pre.left == cur || pre.right == cur){
                if(cur.left != null){
                    stack.push(cur.left);
                }else if(cur.right != null){
                    stack.push(cur.right);
                }else{
                    returnList.add(cur.val);
                    stack.pop();
                }                
            }else if(cur.left == pre && cur.right!=null){
                    stack.push(cur.right);
                    
            }else{
                returnList.add(cur.val);
                stack.pop();
            }
            pre = cur;
        }
        return returnList;
    }
}