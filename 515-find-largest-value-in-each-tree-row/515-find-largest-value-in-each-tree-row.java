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
        List<Integer> l_val = new ArrayList<>();
        helper(root,l_val,0);
        return l_val;
    }
    public void helper(TreeNode root, List<Integer> l_val,int level){
       if(root == null)return;
        
        if(level == l_val.size()){
            l_val.add(root.val);
        }else{
            l_val.set(level,Math.max(l_val.get(level),root.val));
        }
        helper(root.left,l_val,level+1);
        helper(root.right,l_val,level+1);
      
        
    }
}