package LinkedList;

class Node{
    int data;
    Node prev;
    Node next;
    
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    public  void addE(int data){
        Node newNode = new Node(data);
        Node temp = head;
        
        if(head == null){
            head = newNode;
            return;
        } 

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp; 
    }
    

    public void addAtFirst(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head =  newNode;

    }

    public void addAtEnd(int data){

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return ;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp; 
    }
    
    public void addAtPos(int data, int pos) {
        if (pos <= 0) return;

        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            if (head != null)
                head.prev = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        if (temp == null) return;
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }


    public void deleteAtPos(int pos){
        if(head == null) return ;
        else if(pos == 1){
            head = head.next;
            if(head.next != null)
                head.prev = null;
            return;
        }
        else{
            Node temp = head;
            for(int i = 0 ; i < pos -1 ;i++){
                if(temp != null || temp.next != null) return;

                temp = temp.next;
            }
            if(temp.next == null) return; 
            temp.next = temp.next.next;

            if(temp.next.next.prev != null)
                temp.next.next.prev = temp;
        }
    }

    public void DeleteAtEnd() {

        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }


    public void reverse(){

    }

    public void PrintLL(){
        if(head == null) {
            System.out.println("emptyList");
            return ;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DoublelyLinkedList {
    public static void main(String [] args){
        LinkedList ls = new LinkedList();
        ls.addE(5);
        ls.addE(6);
        ls.addE(5);
        ls.PrintLL();
        ls.addAtFirst(2);
        ls.PrintLL();
        ls.addAtEnd(7);
        ls.PrintLL();
        ls.DeleteAtEnd();
        ls.PrintLL();
        ls.addAtPos(1, 2);
        ls.PrintLL();
        // ls.deleteAtPos(2);
        // ls.PrintLL();
    }
}
