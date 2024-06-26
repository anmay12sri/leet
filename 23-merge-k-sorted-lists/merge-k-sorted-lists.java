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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer >pq=new PriorityQueue<>();
        for(ListNode list:lists){
 
                 while(list!=null){
                    pq.offer(list.val);
                    list=list.next;
                 }
            
        }
        ListNode ans=new ListNode(0);
        if(pq.size()==0)return null;
        else{
            ListNode temp=ans;
            while(pq.size()!=0){
                temp.next=new ListNode(pq.poll());
                temp=temp.next;
            }
        }
        return ans.next;
    }
}