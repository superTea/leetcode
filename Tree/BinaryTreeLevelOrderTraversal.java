/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * 
 * @author superTea
 * @date Aug.12,2014
 * @platform LeetCode OJ
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> wholeList = new ArrayList<List<Integer>>();
        if(root == null){
            return wholeList;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        int curlevel = 1;
        int nextlevel = 0;
        queue.add(root);
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            sublist.add(node.val);
            curlevel--;
            if(node.left != null){
                queue.add(node.left);
                nextlevel++;
            }
            if(node.right != null){
                queue.add(node.right);
                nextlevel++;
            }
            if(curlevel == 0){
                curlevel = nextlevel;
                nextlevel = 0;
                wholeList.add(sublist);
                sublist = new ArrayList<Integer>();
            }
        }
        return wholeList;
    }
}