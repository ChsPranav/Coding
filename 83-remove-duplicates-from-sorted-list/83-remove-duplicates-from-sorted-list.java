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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode prev=head;
        if(head==null)return null;
        while(temp.next!=null){
            temp=temp.next;
            int value1=temp.val;
            int value2=prev.val;
            if(value1==value2){
                prev.next=temp.next;
            }else{
                prev=temp;
            }
        }
        return head;
    }
}