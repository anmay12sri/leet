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
    public int sumNumbers(TreeNode root) {
        return  rootleaf(root,"");
    }
    public  static int rootleaf(TreeNode root,String ans){
        if(root.left==null&&root.right==null){
            ans=ans+root.val;
            return Integer.parseInt(ans);
        }
        int l=0;
        int r=0;
        if(root.left!=null){
              l=rootleaf(root.left,ans+root.val);
        }
        if(root.right!=null){
              r=rootleaf(root.right,ans+root.val);
        }
        return l+r;
    }
}