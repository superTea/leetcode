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
 * @date July 29th, 2014
 * @platform Leetcode OJ
 * 
 * like bicycle tire. 
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if(head == null){
            return null;
        }
        
        ListNode walker = head;
        ListNode runner = head;
        int i = 0;
        
        while(runner !=null && i < n){
            runner = runner.next;
            i++;
        }
        
        if(runner == null){
            n %= i;
            i = 0;
            runner = head;
            
            while(runner !=null && i < n){
                runner = runner.next;
                i++;
            }
        }
        
        while(runner.next != null){
            walker = walker.next;
            runner = runner.next;
        }
        
        runner.next = head;
        ListNode newHead = walker.next;
        walker.next = null;
        return newHead;
    }
}