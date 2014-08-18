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
 * solution II: walker-runner.Use fast and low pointer. The advantage about fast/slow pointers is that when a circle is located, the    * fast one will catch the slow one for sure.
 * 
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode walker = head;
        ListNode runner = head;
        
        while(runner!=null && runner.next!= null){
            walker = walker.next;
            runner = runner.next.next;
            
            if(walker == runner){
                return true;
            }
        }
        
        return false;
    }
}