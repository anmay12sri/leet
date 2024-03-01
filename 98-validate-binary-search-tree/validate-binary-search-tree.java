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
    public boolean isValidBST(TreeNode root) {
        return ValidBst(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean ValidBst(TreeNode root,long MinVal,long MaxVal){
        if(root==null)return true;
        if(root.val<=MinVal || root.val>=MaxVal)return false;

        return ValidBst(root.left,MinVal,root.val) &&
            ValidBst(root.right,root.val,MaxVal);
    }
}