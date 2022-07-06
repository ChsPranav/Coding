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
        ListNode top=head;
        ListNode back=head;
        ListNode prev=null;
        while( top!=null && top.next!=null){
            prev=back;
            top=top.next.next;
            back=back.next;
        }
        if(prev!=null){
            prev.next=back.next;
        }
        else{
            head=head.next;
        }
        return head;
    }
}