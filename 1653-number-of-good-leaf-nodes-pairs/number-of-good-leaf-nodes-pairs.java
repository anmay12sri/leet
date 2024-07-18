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
    public int countPairs(TreeNode root, int distance) {
        if (root == null) {
            return 0;
        }
        int rig = countPairs(root.right, distance);
        int lef = countPairs(root.left, distance);
        Map<Integer, Integer> hen1 = new HashMap<>();
        solve(hen1, root.left, 1);
        Map<Integer, Integer> hen2 = new HashMap<>();
        solve(hen2, root.right, 1);
        int ans = rig + lef;
        for (int i = 1; i < distance; i++) {
            for (int j = 1; j + i <= distance; j++)
                ans += hen1.getOrDefault(i, 0) * hen2.getOrDefault(j, 0);
        }
        return ans;
    }

    private void solve(Map<Integer, Integer> hen, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            solve(hen, root.right, level + 1);
        }
        if (root.left != null) {
            solve(hen, root.left, level + 1);
        }
        if (root.right == null && root.left == null) {
            hen.put(level, hen.getOrDefault(level, 0) + 1);
        }
    }
}