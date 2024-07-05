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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp=head;
        ListNode curr=head.next;
        int prev=Integer.MIN_VALUE;
        int mindist=Integer.MAX_VALUE;
        int i=1;
        int first=-1;

        while(curr.next!=null){
            if((curr.val<temp.val && curr.val<curr.next.val)|| (curr.val>temp.val && curr.val>curr.next.val)){
                if(prev!=Integer.MIN_VALUE){
                    mindist=Math.min(mindist,i-prev);
                }
                if(first==-1){
                    first=i;
                }
                prev=i;
                
            }
                temp=curr;
                curr=curr.next;
                i++;
            }
            if(mindist==Integer.MAX_VALUE){
                return new int[]{-1,-1};
        }
        return new int[]{mindist,prev-first};
    }
}