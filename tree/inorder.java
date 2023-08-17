class node{
    int key;
    node right;
    node left;
    node(int k ){
        key=k;
        left=right=null;
    }
}
class inorder{
    public static void order(node root){
        if(root!=null){
            order(root.left);
            System.out.println(root.key+" ");
            order(root.right);

        }
    }
    public static void main(String[] args) {
        node root =new node(10);
        root.left=new node(20);
        root.right=new node(30);
        root.right.left=new node(40);
        root.right.right=new node(50);
        order(root);
    }
}

