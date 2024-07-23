class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        TreeNode result=null;
        while(!queue.isEmpty()){
            TreeNode curr=queue.poll();
            if(p.val<=curr.val && q.val>=curr.val || p.val>=curr.val && q.val<=curr.val){
                return curr;
            } 
            if(p.val<curr.val && q.val<curr.val){
                queue.offer(curr.left);
            }
            if(p.val>curr.val && q.val>curr.val){
                queue.offer(curr.right);
            }

        }
        return null;
    }
}

// TC: O(n), SC: O(n)