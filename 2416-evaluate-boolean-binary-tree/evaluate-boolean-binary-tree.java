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
    public boolean evaluateTree(TreeNode root) {
        if (root.val <= 1)
            return root.val == 1 ? true : false;

        // int a=evaluateTree(root.left);
        // int b=evaluateTree(root.right);

        if(root.val==2){
            return evaluateTree(root.left)||evaluateTree(root.right);
        }

        return evaluateTree(root.left)&& evaluateTree(root.right);
        
    }
}