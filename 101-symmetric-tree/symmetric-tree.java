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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        Stack<TreeNode> st=new Stack<>();
        st.push(root.left);
        st.push(root.right);
        while(!st.isEmpty()){
            TreeNode n1=st.pop();
            TreeNode n2=st.pop();
            if(n1==null && n2==null){
                continue;
            }
            if(n1==null || n2==null ||n1.val!=n2.val){
                return false;
            }
            st.push(n1.left);
            st.push(n2.right);
            st.push(n1.right);
            st.push(n2.left);
        }
        return true;
        
        
        
    }
}