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
    public ListNode[] splitListToParts(ListNode head, int k) {
      ListNode arr[]=new ListNode[k];
      int size=0;
      ListNode temp=head;
      while(temp!=null){
        size++;
        temp=temp.next;
      }
      int sizek=size/k;
      int remaining=size%k;

        ListNode current=head;
      for(int i=0;i<k;i++){
        ListNode newnode=new ListNode(0);
        ListNode prev=newnode;
        int curr=sizek;
        if(remaining>0){
            remaining--;
            curr++;
        }
        int j=0;
        while(j<curr){
            prev.next=new ListNode(current.val);
            prev=prev.next;
            j++;
            current=current.next;
        }

        arr[i]=newnode.next;
      }
      return arr; 
    }
}