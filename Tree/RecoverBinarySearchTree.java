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
 * @date Aug.27, 2014
 * @platform LeetCode OJ
 */
public class Solution {
    public void recoverTree(TreeNode root) {
        if(root == null){
            return;
        }
        ArrayList<TreeNode> pre = new ArrayList<TreeNode>();
        pre.add(null);
        ArrayList<TreeNode> recover = new ArrayList<TreeNode>();
        helper(root, pre, recover);
        if(recover.size()>0){
            int temp = recover.get(0).val;
            recover.get(0).val = recover.get(1).val;
            recover.get(1).val = temp;
        }
    }
    
    public void helper(TreeNode root, ArrayList<TreeNode> pre, ArrayList<TreeNode> recover){
        if(root == null){
            return;
        }
        helper(root.left, pre, recover);
        if(pre.get(0)!=null && pre.get(0).val > root.val){
            if(recover.size() == 0){
                recover.add(pre.get(0));
                recover.add(root);
            }else{
                recover.set(1, root);
            }
        }
        pre.set(0,root);
        helper(root.right,pre,recover);
    }
}