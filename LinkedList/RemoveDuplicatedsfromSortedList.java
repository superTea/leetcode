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
 * @paltform LeetCode OJ
 * 
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        
        while(cur.next != null){
            ListNode next = cur.next;
            if(cur.val < cur.next.val){
                pre = pre.next;
            }else{
                pre.next = cur.next;
            }
            cur = next;
        }
        
        return dummy.next;
    }
}