/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 * 
 * 
 * @author superTea
 * @date Aug.20,2014
 * @platform LeetCode OJ
 */

public class Solution {
    /**
     * 
     * @param TreeLinkNode pre, using to connect first node to last node of each level
     * @param TreeLinkNode headLinkNode, the head node of current level
     * @param TreeLinkNode nextLinkNode, the head node of next level
     * @param TreeLinkNode curNode, the current pointer
     *
     */ 
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
        
        TreeLinkNode pre = null;
        TreeLinkNode headLinkNode = root;
        TreeLinkNode nextLinkNode = null;
        
        while(headLinkNode != null){
            TreeLinkNode curNode = headLinkNode;
            while(curNode != null){
                if(curNode.left != null){
                    if(nextLinkNode == null){
                        nextLinkNode = curNode.left;
                        pre = nextLinkNode;
                    }else{
                        pre.next = curNode.left;
                        pre = pre.next;
                    }
                }
                if(curNode.right != null){
                    if(nextLinkNode == null){
                        nextLinkNode = curNode.right;
                        pre = nextLinkNode;
                    }else{
                        pre.next = curNode.right;
                        pre = pre.next;
                    }
                }
                curNode = curNode.next;
            }
            headLinkNode = nextLinkNode;
            nextLinkNode = null;
        }
    }
}