class node {
    int data;
    node right, left;

    node(int k) {
        data = k;
        right = left = null;
    }
}

public class postorder {
    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.right.left = new node(40);
        root.right.right = new node(50);
        root.left.left = new node(60);
        root.left.right = new node(70);

        postordertraversal(root);

    }

    public static void postordertraversal(node root) {
        if (root != null) {
            postordertraversal(root.left);
            postordertraversal(root.right);
            System.out.println(root.data);
        }
    }

}
