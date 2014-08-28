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
 * Solution I: If pointer 1 goes X steps from start node and pointer 2 goes X steps form K node.      
 * They will meet at the start place of cycle. Complexity is O(n)
 * See: http://blog.csdn.net/kenden23/article/details/13871699
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        
        if(fast ==null || fast.next ==null){
            return null;
        }
        
        slow = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }
}