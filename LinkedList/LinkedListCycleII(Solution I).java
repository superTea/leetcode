/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * 
 * @author superTea
 * @date July 25th, 2014
 * @platform leetcode
 * Solution I: ues hashset. Have extra space;
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        
        HashSet<ListNode> nodeSet = new HashSet<ListNode>();
        ListNode node = head;
        while(node != null){
            if(nodeSet.contains(node)){
                return node;
            }else{
                nodeSet.add(node);
                node = node.next;
            }
        }
        
        return null;
    }
}