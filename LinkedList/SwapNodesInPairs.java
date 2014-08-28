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
 * @author superTea
 * @date July 25th, 2014
 * @platform leetcode
 * 
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        
        while(cur != null && cur.next !=null){
            ListNode next = cur.next.next;
            cur.next.next = cur;
            pre.next = cur.next;
            if(next!=null && next.next !=null){
                cur.next = next.next;
            }else{
                cur.next = next;
            }
            pre = cur;
            cur = next;
        }
        return dummy.next;
    }
}