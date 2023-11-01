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
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }


int maxCount = 0, prev = Integer.MIN_VALUE, count = 0;
    List<Integer> list = new ArrayList<>();

    void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left); // Left SubTree
        count += prev == root.val ? 1 : -count;
        prev = root.val;
        if(maxCount <= count){
            if(maxCount < count){
                maxCount = count;
                list.clear();
            }
            list.add(prev);
        }
        inOrder(root.right); // Right SubTree
    } 
    
}