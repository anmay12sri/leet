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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>list=new ArrayList<>();
        if(root==null)return list;
        dfs(root,"",list);
        return list;
    }
    public static void dfs(TreeNode root,String s,List<String>lis){
        if(root.left==null&& root.right==null)lis.add(s+root.val);
        if(root.left!=null)dfs(root.left,s+root.val+"->",lis);
        if(root.right!=null)dfs(root.right,s+root.val+"->",lis);
    }
}