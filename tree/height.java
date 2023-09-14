class node {
    int key;

    node left;
    node right;

    node(int data) {
        key = data;
        left = right = null;
    }

}

public class height {
    public static int heightbt(node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(heightbt(root.left), heightbt(root.right)) + 1;
    }

    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.right.left = new node(40);
        root.right.right = new node(50);

        heightbt(root);

    }

}
