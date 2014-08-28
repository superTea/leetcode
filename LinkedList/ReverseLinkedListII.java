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
 * @date July 30th, 2014
 * @platform LeetCode OJ
 * 
 * 
 * 
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null){
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        int i = 1; // pay attention to index postion. stop postition is before pivot point.
        
        while(pre.next !=null && i<m){
            pre = pre.next;
            i++;
        }
        
        if(pre.next ==null){
            return dummy.next;
        }
        ListNode mnode = pre.next;
        ListNode cur = mnode.next;
        while(cur !=null && i<n){
            ListNode next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            mnode.next = next;
            cur = next;
            i++;
        }
        
        return dummy.next;
    }
}