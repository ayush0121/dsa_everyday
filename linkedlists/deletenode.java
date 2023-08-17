class node{
    int data;
    node next;
    node(int key){
        this.data=key;
        next=null;
    }
}

class deletenode{
    public static void main(String[] args) {
        
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        
        printlist(head);
        head=delete(head);
        printlist(head);
        
    }
    static node delete(node head){
        if(head==null){
            return null;
        }else{
            return head.next;
        }
    }
    public static void printlist(node head){
        node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;

        }
        System.out.println();
    }
    
}