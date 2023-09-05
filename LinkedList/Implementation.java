package LinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
            }
            head = temp;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            int count = 0;
            Node temp = head;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        void insertAt(int ind, int val){
            if(ind == size()){
                insertAtEnd(val);
                return;
            }
            Node t = new Node(val);
            Node temp =head;
            for (int i = 0; i < ind-1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(9);
        ll.insertAtEnd(0);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtHead(8);
        ll.insertAtHead(56);
        ll.display();
        System.out.println();
        ll.insertAt(6,10);
        ll.display();
        System.out.println();
        System.out.println(ll.head.data +" "+ ll.tail.data);
    }
}