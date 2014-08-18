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
 * Solution: use divide and conqured method
 * 
 */
public class Solution {
    public ListNode mergeKLists(List<ListNode> lists) {
        if(lists == null || lists.size() == 0){
            return null;
        }
        return helperMethod(lists, 0, lists.size()-1);
    }
    
    public ListNode helperMethod(List<ListNode> lists, int start, int end){
        if(start < end){
            int mid = (start + end) / 2;
            ListNode part1 = helperMethod(lists, start, mid);
            ListNode part2 = helperMethod(lists, mid+1, end);
            return merge(part1, part2);
        }else{
            return lists.get(start);
        }
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode pre = dummy;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l1  = l1.next;
            }else{
                ListNode next = l2.next;
                l2.next = pre.next;
                pre.next = l2;
                l2 = next;
            }
            pre = pre.next;
        }
        
        if(l2 != null){
            pre.next = l2;
        }
        
        return dummy.next;
    }
}