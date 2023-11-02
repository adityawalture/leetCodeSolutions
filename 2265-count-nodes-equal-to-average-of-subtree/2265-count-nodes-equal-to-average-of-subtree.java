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
    public int averageOfSubtree(TreeNode root) {
        search(root);

        return ans;
    }
    int ans = 0;
    private int[] search(TreeNode node) {

        if (node == null)
            return new int[]{0,0};

        int[] leftSide = search(node.left);
        int[] rightSide = search(node.right);

        int sumOfAllNodes = leftSide[0] + rightSide[0] + node.val; 

        int countOfAllNodes = leftSide[1] + rightSide[1] + 1;

        if (sumOfAllNodes / countOfAllNodes == node.val)
            ans++;
        return new int[]{sumOfAllNodes, countOfAllNodes};
    }
}