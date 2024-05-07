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
    public ListNode doubleIt(ListNode head) {
        ListNode reversed=reverse(head);
        ListNode prev=null;
        ListNode temp=reversed;
        int carry=0;

        while(temp!=null){
            int newval=temp.val*2+carry;

            temp.val=newval%10;

            if(newval>9){
                carry=1;
            }else{
                carry=0;
            }
            prev=temp;
            temp=temp.next;
        }
        if(carry!=0){
            ListNode extra=new ListNode(carry);
            prev.next=extra;
        }
        ListNode result=reverse(reversed);
        return result;
    }
    public ListNode reverse(ListNode node){
    ListNode prev=null;
    ListNode first=node;

    while(first!=null){
        ListNode second=first.next;
        first.next=prev;
        prev=first;
        first=second;
    }
    return prev;
    }
}