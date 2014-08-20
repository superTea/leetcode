/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 * 
 * @author superTea
 * @date Aug.20,2014
 * @platform LeetCode OJ
 * 
 * 
 */
public class Solution {
    /**
     * 
     * @param TreeLinkNode pre, using this pointer to connect node from first node to the last node of each level
     * @param TreeLinkNOde curNode, current pointer
     * @param TreeLinkNode headLineNode, the head pointer of current level
     * @param TreeLinkNode nextLineNode, the head pointer of next level
     */
     
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
        TreeLinkNode pre = null;
        TreeLinkNode headLineNode = root;
        TreeLinkNode nextLineNode = null;
        
        while(headLineNode != null){
            
            TreeLinkNode curNode = headLineNode;
            
            while(curNode != null){
                if(curNode.left != null){
                    if(nextLineNode == null){
                        nextLineNode = curNode.left;
                        pre = nextLineNode;
                    }else{
                        pre.next = curNode.left;
                        pre = pre.next;
                    }
                }
                if(curNode.right != null){
                    if(nextLineNode != null){
                        pre.next = curNode.right;
                        pre = pre.next;
                    }
                }
                curNode = curNode.next;
            }
            
            headLineNode = nextLineNode;
            nextLineNode = null;
        }
    }
}