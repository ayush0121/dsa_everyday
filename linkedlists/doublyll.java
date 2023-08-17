class Node {
    int data;
    Node next;
    Node prev;

    Node(int key) {
        data = key;
        next = null;
        prev = null;
    }
}

public class doublyll {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp = new Node(20);
        Node temp1 = new Node(30);
        Node temp2 = new Node(40);
        head.next = temp;
        temp.prev = head;
        temp.next = temp1;
        temp1.prev = temp;
        temp1.next = temp2;
        temp2.prev = temp1;
        printlist(head);

    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
            System.out.println();
        }
    }

}
