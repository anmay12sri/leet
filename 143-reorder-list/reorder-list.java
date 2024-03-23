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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l1=head;
        ListNode l2=reverse(slow);
        merge(l1,l2);
    }
    public static ListNode reverse( ListNode l2){
        if(l2==null)return null;
        ListNode prev=null;
        ListNode curr=l2;
         

        while(curr!=null){
         ListNode front=curr.next;
          curr.next=prev;
          prev=curr;
          curr=front;  
        }
        return prev;
    }
    public static void merge(ListNode l1,ListNode l2){
        while(l2!=null){
            ListNode next=l1.next;
            l1.next=l2;
            l1=l2;
            l2=next;
        }
    }
}