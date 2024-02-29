/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList();
        int level=0;
        q.add(root);
         
        while(!q.isEmpty()){
           int n=q.size();
           int prev=level%2==0?Integer.MIN_VALUE:Integer.MAX_VALUE;
            
           for(int i=0;i<n;i++){
               TreeNode node=q.remove();
               if(level%2==0 &&(node.val%2==0||node.val<=prev)){
                   return false;
               }
               if(level%2!=0 &&(node.val%2!=0||node.val>=prev)){
                   return false;
               }
               prev=node.val;
               if(node.left!=null){
                   q.add(node.left);
               }
               if(node.right!=null){
                   q.add(node.right);
               }
           }
           level++;
        }
        return true;
    }
}