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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer>set=new HashSet<>();
        for(int num:to_delete){
            set.add(num);
        }
        List<TreeNode>list=new ArrayList<>();
        if(!set.contains(root.val))list.add(root);
        dfs(root,list,set);
        return list;
    }
    public TreeNode dfs(TreeNode root,List<TreeNode>list,Set<Integer>set){
        if(root==null){
            return null;
        }
        root.left=dfs(root.left,list,set);
        root.right=dfs(root.right,list,set);

        if(set.contains(root.val)){
            if(root.left!=null){
                list.add(root.left);
            }
            if(root.right!=null){
                list.add(root.right);
            } 
            return null;
            
        }
        return root;
    }
}