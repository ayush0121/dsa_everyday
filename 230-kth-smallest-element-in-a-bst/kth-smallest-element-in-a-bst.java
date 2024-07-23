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
    List<Integer> values=new ArrayList<>();
    public void inorder(TreeNode root, List<Integer> values){
        if(root==null){
            return ;
        }
        inorder(root.left,values);
        values.add(root.val);
        inorder(root.right, values);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> val=new ArrayList<>();
        inorder(root,val);
        return val.get(k-1);
        
        
    }
}