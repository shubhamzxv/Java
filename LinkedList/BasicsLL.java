package LinkedList;

public class BasicsLL {
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        System.out.println("Linked list basics");
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //displaying linked list
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

        for (int i = 0; i < 5; i++) {
            Node temp =  
        }
    }
}
