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
    List<Integer> arr=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        for (int i = 1; i < ans.size(); i++) {
            if (ans.get(i) <= ans.get(i - 1)) { // Correct comparison logic
                return false;
            }
        }
        return true;

        
    }
    public void inorder(TreeNode root,List<Integer> arr){
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
}