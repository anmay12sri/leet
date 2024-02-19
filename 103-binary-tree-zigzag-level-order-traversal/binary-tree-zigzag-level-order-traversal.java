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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null)return list;
        boolean flag=true;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>lis=new ArrayList<>(n);
            for(int i=0;i<n;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                if(flag){
                    lis.add(q.poll().val);
                }else{
                    lis.add(0,q.poll().val);
                }
            }
            flag=!flag;
            list.add(lis);
        }
        return list;
    }
}