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
    public int diameterOfBinaryTree(TreeNode root) {
        int max[]=new int[1];
        diameter(root,max);
        return max[0];
    }
    public int diameter(TreeNode root,int max[]){
        if(root==null)return 0;
       
       int ls=diameter(root.left,max);
       int rs=diameter(root.right,max);
       max[0]=Math.max(max[0],ls+rs);
       return 1+Math.max(ls,rs);
    }
}