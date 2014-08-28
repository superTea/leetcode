/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 *
 * 
 * 
 * @author superTea
 * @date July 15th 2014
 * @platform LeetCode OJ
 * 
 * 
 */

  
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null){
             return null;
        }
        
        ListNode helper = new ListNode(0);
        ListNode curr = head;
        ListNode prev;
	ListNode next;
        
        while(curr != null){
            next = curr.next;
            prev = helper;
            
            while(prev.next!= null && prev.next.val<curr.val){
                prev = prev.next;
            }
            
            curr.next = prev.next; // update the next point of current node to the next point of current position
            prev.next = curr; 
            curr = next;
        }
        
        return helper.next;
    }
}