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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode();
        ListNode right=new ListNode();
        ListNode temp_left=left;
        ListNode temp_right=right;
        ListNode temp=head;
        while(temp!=null){
             if(temp.val<x){
                 temp_left.next=new ListNode(temp.val);
                 temp_left=temp_left.next;
             }
            else {
                temp_right.next=new ListNode(temp.val);
                 temp_right=temp_right.next;
            }
            temp=temp.next;
            }
        // ListNode data=new ListNode(x);
        // data.next=right;
        temp_left.next=right.next;
        head=left.next;
        return head;
        
        
    }
}