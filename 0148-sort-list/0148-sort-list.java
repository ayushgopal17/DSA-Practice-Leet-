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
    public ListNode sortList(ListNode head) {
        if(head ==null) return head;

       ArrayList<Integer> list=new ArrayList<>();
       for(ListNode t=head;t!=null;t=t.next){
        list.add(t.val);
       }
       Collections.sort(list);

       int i=0;
       for(ListNode t=head;t!=null;t=t.next){
        t.val=list.get(i++);
       }
    return head;
    }
}