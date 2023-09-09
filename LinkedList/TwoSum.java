package LinkedList;

import java.util.List;

public class TwoSum {
    public static class ListNode{
        int val ;
        ListNode next =null;
        ListNode(int data) {
            this.val = data;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode temp1 = l1;
    ListNode temp2 = l2;
    int a= 0;
    int temp=1;
    int b = 0;
    while(temp1!=null){
        a=a+temp1.val*temp;
        temp*=10;
        temp1= temp1.next;
    }
    temp=1;
    while(temp2!=null){
        b+=temp2.val*temp;
        temp*=10;
        temp2= temp2.next;
    }
    a+=b;
    //a=100000;
    ListNode result = new ListNode(0);
    if(a==0) return result;
    ListNode ptr = result;

    while(a>0){
        temp=a%10;
        a= a/10;

        ptr.next = new ListNode(0);
        ptr.next.val= temp;
        ptr = ptr.next;
    }
    return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l24 = new ListNode(9);
        ListNode l25= new ListNode(9);
        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(9);
        ListNode l23 = new ListNode(9);



        l2.next = l22;
        l22.next = l23;
        l23.next= l24;
        l24.next= l25;

        System.out.println(addTwoNumbers(l1,l2).val);
//        System.out.println(addTwoNumbers(l1,l2).next.val);
//        System.out.println(addTwoNumbers(l1,l2).next.next.val);
//        System.out.println(addTwoNumbers(l1,l2).next.next.next.val);
//        System.out.println(addTwoNumbers(l1,l2).next.next.next.next.val);
//        System.out.println(addTwoNumbers(l1,l2).next.next.next.next.next.val);
//        System.out.println(addTwoNumbers(l1,l2).next.next.next.next.next.next.val);



    }
}
