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
 * @date July 28th, 2014
 * @platform LeetCode
 */
 
 
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        int i = 0;
        
        while(cur != null){
            i++;
            ListNode next = cur.next;
            if(k == i){
                pre = reverse(pre, next);
                i = 0;
            }
            
            cur = next;

        }
        
        return dummy.next;
    }
    
    private ListNode reverse(ListNode pre, ListNode end){
        if(pre== null || pre.next == null){
            return pre;
        }
        
        ListNode head = pre.next;
        ListNode cur = pre.next.next;
        
        while(cur != end){
            ListNode next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        
        head.next = end; //connect the last one with end
        return head;
    }
}