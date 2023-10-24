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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        
        que.offer(root);
        if(root == null) return ans;
        
        while(!que.isEmpty()){
            int level = que.size();
            int max = Integer.MIN_VALUE;
            for(int i=0; i<level; i++){
                TreeNode temp = que.poll();
                if(temp.left != null){
                    que.offer(temp.left);
                }
                if(temp.right != null){
                    que.offer(temp.right);
                }
                max = Math.max(max, temp.val);
            }
            ans.add(max);
        }
        return ans;
    }
}