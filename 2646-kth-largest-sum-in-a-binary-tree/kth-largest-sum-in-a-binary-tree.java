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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        List<Long>levelsum=new ArrayList<>();

        if(root==null)return -1;

        while(!q.isEmpty()){
            int levelsize=q.size();

            long sum=0;

            for(int i=0;i<levelsize;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;

                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            levelsum.add(sum);
             
        }
        Collections.sort(levelsum,Collections.reverseOrder());
            if(k<=levelsum.size()){
                return levelsum.get(k-1);
            }
            return -1;
    }
}