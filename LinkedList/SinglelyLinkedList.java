package LinkedList;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void addE(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return ;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode; 

    }

    public void addAtFirst(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
        }

        else{
            newNode.next = head;
            head = newNode;
        }

    }

    public void addAtEnd(int data){

        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            } 
            temp.next = newNode;
        }
    }

    public void addAtPos(int data, int pos){
        Node newNode = new Node(data);

        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node temp = head;
            for(int i = 1 ;i < pos-1 ;i++){
                if(temp == null) return;
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteAtPos(int pos){
        if(pos == 1){
            head = head.next;
        }
        else{
            Node temp = head;
            for(int i = 1; i < pos-1 ; i++){
                if(temp == null) return; 
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }


    }

    public void reverse(){
        if(head == null) {
            System.out.println("EmptyList");
            return;
        }
        else if(head.next == null){
            System.out.println(head.data);
        }
        else {
            Node curr = head, prev = null, next;
            while(curr != null){

                next = curr.next;

                curr.next = prev;

                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }
    public void PrintLL(){

        if(head == null) {
            System.out.println("EmptyList");
            return ;
        }
        Node temp = head;

        if(temp.next == null){
            System.out.println(temp.data +" ");
            return;
        }
        
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SinglelyLinkedList{
    public static void main(String[] args) {
        LinkedList ls  = new LinkedList();
        int arr[] = {1,2,3,4,5,6};
        for(int i = 0 ;i < arr.length;i++){
            ls.addE(arr[i]);
        }
        ls.PrintLL();
        ls.addAtEnd(7);
        ls.PrintLL();
        ls.addAtFirst(0);
        ls.PrintLL();
        ls.addAtPos(4, 5);
        ls.PrintLL();
        ls.deleteAtPos(5);
        ls.PrintLL();
        ls.reverse();
        ls.PrintLL();
    }
}

