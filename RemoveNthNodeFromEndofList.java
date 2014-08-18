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
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        ListNode walker = head;
        ListNode runner = head;
        int i = 0;
        
        while(runner!=null && i < n){
            runner = runner.next;
            i++;
        }
        
        if(runner == null){
            return head.next;
        }
        
        if(i<n){
            return head;
        }
        
        while(runner.next != null){
            runner = runner.next;
            walker = walker.next;
        }
        
        walker.next = walker.next.next;
        return head;
    }
}