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
    public String getDirections(TreeNode root, int startValue, int destValue) {
       TreeNode lcaNode = findLCA(root, startValue, destValue);

        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToDest = new StringBuilder();

        findPath(lcaNode, startValue, pathToStart);
        findPath(lcaNode, destValue, pathToDest);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < pathToStart.length(); i++) {
            result.append("U");
        }
        result.append(pathToDest);

        return result.toString();
    }

    private TreeNode findLCA(TreeNode root, int start, int dest) {
        if (root == null) {
            return null;
        }
        if (root.val == start || root.val == dest) {
            return root;
        }

        TreeNode left = findLCA(root.left, start, dest);
        TreeNode right = findLCA(root.right, start, dest);

        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }

    private boolean findPath(TreeNode root, int target, StringBuilder path) {
        if (root == null) {
            return false;
        }
        if (root.val == target) {
            return true;
        }

        path.append('L');
        if (findPath(root.left, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        path.append('R');
        if (findPath(root.right, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        return false;
    }
}