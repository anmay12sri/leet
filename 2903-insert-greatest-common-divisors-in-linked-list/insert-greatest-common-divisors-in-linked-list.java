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
    private int gcd(int a,int b){
        if(a==1||b==1)return 1;

        while(b!=0){
            int rem=a % b;
            a=b;
            b=rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)return head;

        ListNode temp1=head;
        ListNode temp2=head.next;

        while(temp2!=null){
            int val=gcd(temp1.val,temp2.val);
            ListNode newnode=new ListNode(val);
            temp1.next=newnode;
            newnode.next=temp2;
            temp1=temp2;
            temp2=temp2.next;


        }
        return head;

    }
}