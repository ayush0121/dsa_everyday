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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int li=dfs(root.left);
        int ri=dfs(root.right);
        if(Math.abs(li-ri)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
          
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int rh=dfs(root.right);
        int lh=dfs(root.left);
        return 1+Math.max(rh,lh);
    }
    
    
        
    }
    
