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
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        count=count-n;
        System.out.println("count"+count);
        ListNode prev=null;
        ListNode curr=head;
        while(count>0){
            prev=curr;
            curr=curr.next;
            count--;
        }
        System.out.println(curr.val);
        if(curr.next!=null ){
            if(prev==null){
                head=head.next;
            }else{
               prev.next=curr.next; 
            }
            
                            }
       else if(curr.next==null && count==0)
        {
           if(prev==null){
               head=null;
               //prev=head.next;
           }else{
            prev.next=null;
           }
        }
        return head;
    }
}