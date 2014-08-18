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
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null&& l2 == null){
            return null;
        }else if(l1 ==null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next= l1;
        ListNode pre = dummy;
        
        while(l1 !=null && l2 !=null){
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