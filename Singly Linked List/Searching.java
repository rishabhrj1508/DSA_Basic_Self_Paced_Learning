class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class Searching {

    static int search(Node head , int x){
        Node temp = head;
        int count = 1;
        while(temp != null){
            if (temp.data == x) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int pos = search(head, 20);
        System.out.println(pos);
    }
    
}

/*
 Recursive Solution:

    int search(Node head,int x){
        if(head==null){
            return -1;
        }
        if(head.data == x){
            return 1;
        }
        else{
            int res = search(head.next,x);
            if(res==-1){
                return -1;
            }
            else{
                return (res+1);
            }
        }
    }
 */