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
 * @date Aug.20, 2014
 * @Platform LeetCode OJ
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(inorder, postorder, map, 0, inorder.length-1, 0, postorder.length-1);
    }
    
    public TreeNode helper(int[] inorder, int[] postorder, HashMap<Integer, Integer> map, int lowL, int lowR, int postL, int postR){
        if(lowL > lowR || postL > postR){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postR]);
        int index = map.get(root.val);
        root.left = helper(inorder, postorder, map, lowL, index-1, postL, postR-lowR+index-1);
        root.right = helper(inorder, postorder, map, index+1, lowR, postR-lowR+index, postR-1);
        return root;
    }
}