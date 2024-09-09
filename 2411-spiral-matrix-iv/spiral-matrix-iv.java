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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int top=0,bottom=m-1;
        int left=0, right=n-1;

        int res[][]=new int[m][n];
        for(int arr[]:res)Arrays.fill(arr,-1);

        while(head!=null && top<=bottom && left<=right ){
            for(int i=left;i<=right && head!=null;i++){
                res[top][i]=head.val;
                head=head.next;
            }
            top++;
            for(int i=top;i<=bottom && head!=null; i++){
                res[i][right]=head.val;
                head=head.next;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left && head!=null ;i--){
                    res[bottom][i]=head.val;
                    head=head.next;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top && head!=null; i--){
                    res[i][left]=head.val;
                    head=head.next;
                }
                left++;
            }
        }
        return res;
    }
}