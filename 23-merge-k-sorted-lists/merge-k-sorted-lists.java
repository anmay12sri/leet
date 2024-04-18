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
    public ListNode mergeTwolinkedlist(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<l2.val){
          l1.next=mergeTwolinkedlist(l1.next,l2);
          return l1;
        }else{
            l2.next=mergeTwolinkedlist(l2.next,l1);
            return l2;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
       ListNode ans=null;

       for(int i=0;i<lists.length;i++){
        ans=mergeTwolinkedlist(ans,lists[i]);
       }
       return ans;
        
    }
}