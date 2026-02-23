/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode Dummy=new ListNode(0);
         Dummy.next = head;

        ListNode prev = Dummy; 
        
        for(int i=0;i<left-1; ++i){
            prev=prev.next;
        }
        ListNode current=prev.next;
        for(int i=0;i<(right-left);++i){
            ListNode NXT=current.next;
            current.next=NXT.next;
            NXT.next=prev.next;
            prev.next= NXT;
        }
        return Dummy.next;
        
    }
}