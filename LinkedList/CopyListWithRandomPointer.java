/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 *
 *@author superTea
 *@date  July 24th, 2014
 *@platform leetcode
 *Solution I£º Time Complexity: O(n), Space Complexity: O(N)
 */
 
 
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return null;
        }
        
        HashMap<RandomListNode, RandomListNode> copyMap = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode newHead = new RandomListNode(head.label);
        copyMap.put(head, newHead);
        RandomListNode node = head.next;
        RandomListNode copy = newHead;
        
        while(node != null){
            RandomListNode newNode = new RandomListNode(node.label);
            copyMap.put(node, newNode);
            copy.next= newNode;
            copy = newNode;
            node = node.next;
        }
        
        node = head;
        copy = newHead;
        
        while(node != null){
            copy.random = copyMap.get(node.random);
            copy = copy.next;
            node = node.next;
        }
        
        return newHead;
    }
}