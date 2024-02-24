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
    int ans=0;
    int maxheight=Integer.MIN_VALUE;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode root,int height){
        if(root==null)return ;
        if(height>maxheight){
            maxheight=height;
            ans=root.val;
        }
        dfs(root.left,height+1);
        dfs(root.right,height+1);

    }
}