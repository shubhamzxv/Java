package LinkedList;

public class nthNodeFromEnd {


    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNode(Node head, int m){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        temp=head;
        for (int i = 0; i < count -m; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNode2(Node head, int m){
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < m; i++) {
            fast = fast .next;
        }
        while (fast!=null){
            fast= fast.next;
            slow= slow.next;
        }
        return slow;
    }
    public static Node deleteNthNodeFromEnd(Node head, int m){
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < m; i++) {
            fast= fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow= slow.next;
            fast= fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        while (head!=null){
            System.out.print(head.data + " ");
            head= head.next;
        }
    }

    public static void main(String[] args) {
     Node a = new Node(5);
     Node b = new Node(4);
     Node c = new Node(8);
     Node d = new Node(9);
     Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //System.out.println(nthNode2(a,5).data);
        display(a);
        a=deleteNthNodeFromEnd(a,5);
        System.out.println();
        display(a);
    }
}
