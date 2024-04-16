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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
         
        if(root==null)return root;

        if(depth==1){
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            root=temp;
        }
        if(depth-1==1){
            TreeNode temp1=new TreeNode(val);
            temp1.left=root.left;
            root.left=temp1 ;
            TreeNode temp2=new TreeNode(val);
            temp2.right=root.right;
            root.right=temp2;
        }

         addOneRow(root.left,val,depth-1);
         addOneRow(root.right,val,depth-1);

         return root;

    }
}