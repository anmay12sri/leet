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
        if(b==0){
            return a;
        }
        return gcd(b,a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        
        while(curr.next!=null){
            ListNode newNode=new ListNode (gcd(curr.val,curr.next.val),curr.next);
            curr.next=newNode;
             curr=newNode.next;
        }
        return head;
    }
}