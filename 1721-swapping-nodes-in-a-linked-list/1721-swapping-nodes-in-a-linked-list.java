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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head;

        while(--k>0) 
            fast=fast.next;      //reaching kth node from start
        ListNode X=fast;

        ListNode slow=head;

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;

        }   
        ListNode Y=slow;
//swapping  x and y values
        int t=X.val;
        X.val=Y.val;
        Y.val=t;
        return head;
     }
}