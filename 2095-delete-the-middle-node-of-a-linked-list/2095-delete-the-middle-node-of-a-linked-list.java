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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;

        int len=0;
        ListNode temp=head;
        while(temp !=null){
            len++;
            temp=temp.next;
        }
       int mid=len/2;
       ListNode curr=head;
        for(int i=1;i<mid;i++){
            curr=curr.next;
             }
             curr.next=curr.next.next;
             return head;
    }
}