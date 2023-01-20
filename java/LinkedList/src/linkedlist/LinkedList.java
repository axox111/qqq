package linkedlist;
public class LinkedList {
    
    Node head = null;
    
    public void insert(Node val){
        Node new_node = val;
        Node last = this.head;
        if(last == null){
            last = new_node;
        } else {
            last.next = new_node;
            new_node = last; 
        }
    }
    
    public void getList() {
        Node first = this.head;
        while(first != null){
            System.out.println(first.val);
            first = first.next; 
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node a = new Node(7); 
        Node b = new Node(14); 
        Node c = new Node(73); 
        ll.insert(a);
//       ll.insert(b);
//        ll.insert(c);
        ll.getList();
    }
}
