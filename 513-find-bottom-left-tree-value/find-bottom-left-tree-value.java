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
    int maxheight=Integer.MIN_VALUE;
    int ans=0;

    public int findBottomLeftValue(TreeNode root) {
       bottom(root,0);
       return ans; 
    }
    public void bottom(TreeNode root,int height){
        if(root==null)return;
        if(height>maxheight){
         maxheight=height;
         ans=root.val;
        }
        bottom(root.left,height+1);
        bottom(root.right,height+1);
    }
}