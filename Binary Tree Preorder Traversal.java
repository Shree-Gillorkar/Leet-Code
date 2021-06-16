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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<Integer>();
        if(root==null)
            return pre;
        preorder(root, pre);
        return pre;
    }
    
    private void preorder(TreeNode root, List<Integer> pre){
        if(root==null)
            return;
        pre.add(root.val);
        preorder(root.left,pre);
        preorder(root.right,pre);
    }
}
