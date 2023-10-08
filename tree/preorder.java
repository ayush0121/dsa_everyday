import java.io.IOException;

class Node {
    int data;
    Node right, left;

    Node(int k) {
        data = k;
        right = left = null;
    }
}

public class preorder {
    public static void main(String[] args) throws IOException {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.left = new Node(50);
        preordertraversal(root);
    }

    public static void preordertraversal(Node root) {
        if (root != null) {
            System.out.println(root.data + " ");
            preordertraversal(root.left);
            preordertraversal(root.right);
        }

    }

}
