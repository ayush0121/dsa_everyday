class Pair{
    TreeNode node;
    int pos;
    Pair(TreeNode node,int pos){
        this.node=node;
        this.pos=pos;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        int max=0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int min=q.peek().pos;
            int first=0; int last=0;
            for(int i=0;i<size;i++){
                int curr=q.peek().pos-min;
                TreeNode node=q.poll().node;
                if(i==0) first=curr;
                if(i==size-1) last=curr;
                if(node.left!=null) q.add(new Pair(node.left,(2*curr)+1));
                if(node.right!=null) q.add(new Pair(node.right,(2*curr)+2));
            }
            max=Math.max(max,last-first+1);
        }
        return max;
    }
}