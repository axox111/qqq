package linkedlist;
public class LinkedList {
    
    Node head = null;
    
    public void insert(Node val) {
        
        Node new_node = val;
        if(this.head == null) {
            this.head = new_node;
        } else {
            Node islast = this.head;
            while(islast.next != null) {
                islast = islast.next;
                }
            islast.next = new_node;
        }
    }
    
    public void insert(Node val, int pos) {
        
        Node new_node = val;
        Node node = this.head;
        int i = 1;
        int size = this.getSize();
        if (0 > pos | pos > size) {
            System.out.println("Position out of list size");
        } else if (pos == 0) {
            new_node.next = node;
            this.head = new_node;
        } else {
            while (i != pos) {
                node = node.next;
                i = i + 1;
            } 
            new_node.next = node.next;
            node.next = new_node;
        }
    }  
    
    public int getSize() {
        Node islast = this.head;
        int i = 1;
        while (islast.next != null) {
            islast = islast.next;
            i++;
        }
        return i;
    }
    
    public void getList() {
        Node first = this.head;
        while(first.next != null) {
            System.out.print(first.val + ", ");
            first = first.next; 
        }
        System.out.println(first.val);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node a = new Node(7); 
        Node b = new Node(14); 
        Node c = new Node(73); 
        Node d = new Node(56);
        Node g = new Node(2456);
        ll.insert(a);
        ll.insert(b);
        ll.insert(c);
        ll.insert(d);
        ll.insert(g,5);
        ll.getSize();
        ll.getList();
    }
}