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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
        
        if(root == null)
            return ans;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i = 0; i < n; i++){
                TreeNode curr = queue.poll();
                if(i == 0)
                    ans.add(curr.val);
                
                if(curr.right != null)
                    queue.add(curr.right);
                if(curr.left != null)
                    queue.add(curr.left);
                
            }
        }
        
        return ans;
    }
}