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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode>map=new HashMap<>();
        Set<Integer>finall=new HashSet<>();

        for(int d[]:descriptions){
            int par=d[0], child=d[1] ,isLeft=d[2];
            if(!map.containsKey(par)){
                map.put(par,new TreeNode(par));
            }
            if(!map.containsKey(child)){
                map.put(child,new TreeNode(child));
            }
            if(isLeft==1){
              map.get(par).left=map.get(child);
            }else if(isLeft==0){
                map.get(par).right=map.get(child);
             }
             finall.add(child);
        }
        for(Map.Entry<Integer,TreeNode>e:map.entrySet()){
            if(!finall.contains(e.getKey())){
                return e.getValue();
            }
        }
        return null;
        
    }
}