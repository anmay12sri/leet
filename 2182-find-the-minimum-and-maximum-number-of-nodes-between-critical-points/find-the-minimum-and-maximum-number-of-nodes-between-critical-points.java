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
        int arr[]=new int[2];
        ListNode temp=head;
        ListNode curr=head.next;
        int i=1;
        int previ=Integer.MIN_VALUE;
        int min_dist=Integer.MAX_VALUE;
        int firsti=-1;

        while(curr.next!=null){
            if((curr.val>temp.val && curr.val> curr.next.val)||(curr.val<temp.val && curr.val<curr.next.val)){
                 if(previ!=Integer.MIN_VALUE){
                    min_dist=Math.min(min_dist,i-previ);
                 }
                 if(firsti==-1){
                    firsti=i;
                 }
                 previ=i;
            }
            temp=curr;
            curr=curr.next;
            i++;
        }
        if(min_dist==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return new int[]{min_dist,previ-firsti};
    }
}