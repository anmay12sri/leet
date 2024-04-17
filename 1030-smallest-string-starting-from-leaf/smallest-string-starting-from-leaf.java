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
    public String smallestFromLeaf(TreeNode root) {
        return helper(root,new StringBuilder());
    }
    public String helper(TreeNode root,StringBuilder path){
        if(root==null)return "";
        path.insert(0,(char)(root.val+'a'));
        String res="";
        if(root.left==null && root.right==null){
            res=path.toString();
        }else{
            String leftPath=helper(root.left,path);
            String rightPath=helper(root.right,path);
        
        if(leftPath.isEmpty()){
            res=rightPath;
        }else if(rightPath.isEmpty()){
            res=leftPath;
        }else{
            res=leftPath.compareTo(rightPath)<0?leftPath:rightPath;
        }
        }
        path.deleteCharAt(0);
        return res;
    }
}