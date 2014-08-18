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
 * @date Aug.12,2014
 * @platform LeetCode OJ
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(root == null){
            return returnList;
        }
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        int level =1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(root.val);
        returnList.add(list);
        
        while(!stack.isEmpty()){
            LinkedList<TreeNode> newStack = new LinkedList<TreeNode>();
            list = new ArrayList<Integer>();
            while(!stack.isEmpty()){
                TreeNode node = stack.pop();
                if(level % 2 != 0){
                    if(node.right != null){
                        newStack.push(node.right);
                        list.add(node.right.val);
                    }
                    if(node.left != null){
                        newStack.push(node.left);
                        list.add(node.left.val);
                    }
                }else{
                    if(node.left != null){
                        newStack.push(node.left);
                        list.add(node.left.val);
                    }
                    if(node.right != null){
                        newStack.push(node.right);
                        list.add(node.right.val);
                    }
                }
            }
            level++;
            if(list.size()>0){
                returnList.add(list);
            }
            stack = newStack;
        }
        return returnList;
       
    }
}