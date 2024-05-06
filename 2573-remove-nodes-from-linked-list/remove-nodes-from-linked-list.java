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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode>st=new Stack<>();

        ListNode current=head;

        while(current!=null){
            st.push(current);
            current=current.next;
        }
        current=st.pop();
        int max=current.val;
        ListNode resultList=new ListNode(max);

        while(!st.isEmpty()){
            current=st.pop();
            if(current.val<max){
                continue;
            }else{
                ListNode newnode=new ListNode(current.val);
                newnode.next=resultList;
                resultList=newnode;
                max=current.val;
            }
        }
        return resultList;
    }
}