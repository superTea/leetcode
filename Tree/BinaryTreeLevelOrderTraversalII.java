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
 * @date Aug.13, 2014
 * @platform LeetCode OJ
 * 
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(root == null){
            return returnList;
        }
        LinkedList<List<Integer>> wholeStack = new LinkedList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int curlevel = 1;
        int nextlevel = 0;
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            curlevel--;
            sublist.add(node.val);
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
                wholeStack.push(sublist);
                sublist = new ArrayList<Integer>();
            }
        }
        while(!wholeStack.isEmpty()){
            returnList.add(wholeStack.poll());
        }
        return returnList;
    }
}