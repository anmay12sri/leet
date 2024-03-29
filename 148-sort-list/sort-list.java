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
    public static ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;

        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }
            if(left==null){
                temp.next=right;
            }
            if(right==null){
                temp.next=left;
            }
            return dummy.next;
        }

    
    public ListNode sortList(ListNode head) {
        if(head==null|| head.next==null)return head;
        ListNode mid=middle(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;

        return merge(sortList(left),sortList(right));
    }
}