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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==0)return false;
        if(size==1)return true;
        //System.out.println(size);
        if(size%2==0){
            Stack<Integer> stk = new Stack<>();
            ListNode pos=head;
            int mid=size/2;
            //System.out.println(mid);
            int start=0;
            while(start<mid){
                //System.out.println("push value"+pos.val);
                stk.push(pos.val);
                pos=pos.next;
                start++;
            }
            while(pos!=null){
               // System.out.println("pop value"+pos.val);
                Integer x=(Integer)stk.pop();
                //ystem.out.println("x was"+x);
                if(x!=pos.val)return false;
                pos=pos.next;
            }
        }else{
            Stack<Integer> stk = new Stack<>();
            ListNode pos=head;
            int mid=size/2;
            int start=0;
            while(start<mid){
                stk.push(pos.val);
                pos=pos.next;
                start++;
            }
            pos=pos.next;
            while(pos!=null){
                Integer x=(Integer)stk.pop();
                if(x!=pos.val)return false;
                pos=pos.next;
            }
        }
        return true;
        
    }
}