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
 * @date July 28th, 2014
 * @platform LeetCode
 * Use walker-runner determine midpoint of linkedlist
 * 
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    
    private ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode walker = head;
        ListNode runner = head;
        
        while(runner.next !=null && runner.next.next !=null){
            walker = walker.next;
            runner = runner.next.next;
        }
        
        ListNode head2 = walker.next;
        walker.next = null;
        ListNode head1 = head;
        head1 = mergeSort(head1);
        head2 = mergeSort(head2);
        return merge(head1, head2);
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null){
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode pre = dummy;
        
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                ListNode next = l2.next;
                l2.next = pre.next;
                pre.next = l2;
                l2 = next;
            }else{
                l1 = l1.next;
            }
            
            pre = pre.next;
        }
        
        if(l2 != null){
            pre.next = l2;
        }
        
        return dummy.next;
    }
}