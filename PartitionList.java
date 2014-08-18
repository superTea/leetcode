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
 * @author superTea
 * @date July 29th, 2014
 * @platform Leetcode OJ
 * 
 * 
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode walker = dummy; // toward to the last point that less than X before X. 
        ListNode runner = dummy;
        
        while(runner.next != null){
            if(runner.next.val < x){
                if(walker != runner){
                    ListNode next= runner.next.next;
                    runner.next.next = walker.next;
                    walker.next = runner.next;
                    runner.next = next;
                }else{
                    runner = runner.next;
                }
                walker = walker.next;
            }else{
                runner = runner.next;
            }
        }
        
        return dummy.next;
    }
}