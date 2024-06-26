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
    public void Inorder(TreeNode root,List<Integer>sorted){
     if(root==null){
        return ;
     }
     Inorder(root.left,sorted);
     sorted.add(root.val);
     Inorder(root.right,sorted);
    }
    public TreeNode balanceBST(TreeNode root) {
         List<Integer>sorted=new ArrayList<>();
         Inorder(root,sorted);
         return constructbst(sorted,0,sorted.size()-1);
    }
    public TreeNode constructbst(List<Integer>sorted,int l,int r){
         if(l>r){
            return null;
         }
        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(sorted.get(mid));
        root.left=constructbst(sorted,l,mid-1);
        root.right=constructbst(sorted,mid+1,r);

        return root;
    }
}