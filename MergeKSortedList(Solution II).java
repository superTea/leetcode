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
 * Solution: use PriorityQueue
 * 
 */
public class Solution {
    public ListNode mergeKLists(List<ListNode> lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(10, new Comparator<ListNode>(){
            
            @Override
            public int compare(ListNode l1, ListNode l2){
                return l1.val - l2.val;
            } 
        });
        
        for(int i = 0; i < lists.size(); i++){
            ListNode head = lists.get(i);
            if(head != null){
                heap.offer(head);
            }
        }
        
        ListNode newHead = null;
        ListNode cur = newHead;
        
        while(heap.size()>0){
            ListNode node = heap.poll();
            if(newHead == null){
                newHead = node;
                cur = newHead;
            }else{
                cur.next = node;
            }
            cur = node;
            if(cur.next!= null){
                heap.offer(cur.next);
            }
        }
        
        return newHead;
    }
}