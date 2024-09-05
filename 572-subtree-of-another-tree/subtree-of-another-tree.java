
//Iterative BFS
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null && subRoot==null|| root!=null && subRoot==null) return true;
        if(root==null && subRoot!=null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(isSame(temp,subRoot)) return true;
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
        }
        return false;
    }

    private boolean isSame(TreeNode p, TreeNode q){

        if(p==null && q==null) return true;
        if(p==null && q!=null || p!=null && q==null) return false;

        if(p.val!=q.val) return false;

        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
}