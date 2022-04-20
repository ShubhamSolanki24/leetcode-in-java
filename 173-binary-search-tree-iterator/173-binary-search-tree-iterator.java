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
class BSTIterator {
    Stack<TreeNode> st = null;
    TreeNode curr= null;

    public BSTIterator(TreeNode root) {
       curr= root;
       st = new Stack<>();
    }

    public boolean hasNext() {
       return !st.isEmpty() || curr!=null; 
    }
    public int next() {
        while(curr!= null){
            st.push(curr);
            curr= curr.left;
        }
        TreeNode node = st.pop();
        curr= node.right;
        return node.val;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */