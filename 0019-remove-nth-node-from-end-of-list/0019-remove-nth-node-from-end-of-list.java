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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;

        ListNode fp=dummy;
        ListNode sp=dummy;

        for(int i=0;i<n;i++){
            sp=sp.next;
        }
        while(sp.next !=null){
            fp=fp.next;
            sp=sp.next;
        }
        fp.next=fp.next.next;
        return dummy.next;
    }
}