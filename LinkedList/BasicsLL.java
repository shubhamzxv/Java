package LinkedList;

public class BasicsLL {
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node temp){
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data +" ");
        displayr(head.next);
    }
    public static void displayreverse(Node head){
        if(head==null) return;
        displayreverse(head.next);
        System.out.print(head.data +" ");
    }

    public static int Length(Node head) {
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
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

        Node temp = a;
        for (int i = 0; i < 5; i++) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        displayreverse(a);
        System.out.println();
        System.out.println(Length(a));
    }
}
