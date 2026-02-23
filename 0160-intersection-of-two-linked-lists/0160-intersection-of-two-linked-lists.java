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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slow=headA;
        ListNode fast=headB;
    while(slow!=fast){
       slow=(slow==null) ? headA: slow.next;
       fast=(fast==null) ? headB: fast.next;
    }
    return slow;
        
    
}
}