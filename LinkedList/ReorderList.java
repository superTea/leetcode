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
 * @date July 29th, 2014
 * @platform LeetCode OJ
 * pay attention to type(void), should not return anything.
 * 
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        
        ListNode walker = head;
        ListNode runner = head;
        
        while(runner.next != null && runner.next.next != null){
            walker = walker.next;
            runner = runner.next.next;
        }
        
        ListNode head2 = walker.next;
        walker.next = null;
        ListNode head1 = head;
        head2 = reverse(head2);
        while(head1 !=null && head2 != null){
            ListNode next1 = head1.next;
            ListNode next2= head2.next;
            head2.next = head1.next;
            head1.next = head2;
            head1 = next1;
            head2 = next2;
        }
    }
    
    private ListNode reverse(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head.next;
        
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        
        head.next = null;
        return dummy.next;
    }
    
    
}