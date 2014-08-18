/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 *@author superTea
 *@date Aug.15, 2014
 *@platform LeetCode OJ
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num == null || num.length == 0){
            return null;
        }
        return helper(0, num.length-1, num);
    }
    
    public TreeNode helper(int low, int high, int[] num){
        int mid =(low+high)/2;
        
        if(low > high){
            return null;
        }
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(low, mid-1, num);
        node.right = helper(mid+1, high, num);
        return node;
    }
}