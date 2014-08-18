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
 * solution I: use hashset
 * 
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
	if(head == null){
	    return head;
	}
        HashSet<ListNode> checkSet = new HashSet<ListNode>();
        boolean hasCycle = false;
        ListNode node = head;
        
        while(node != null){
            if(checkSet.contains(node)){
                hasCycle = true;
                break;
            }else{
                checkSet.add(node);
                node = node.next;
            }
        }
        
        return hasCycle;
    }
}