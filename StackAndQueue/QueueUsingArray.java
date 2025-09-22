package StackAndQueue;

public class QueueUsingArray {
    int start = -1;
    int end = -1;
    int size = 5;
    int cursize = 0;
    int q [] = new int[size];

    public void push(int x){
        if(cursize == size) {
            System.out.println("Queue is filled");
            return ;
        }

        if(cursize == 0){
            start = end  = 0;
        }

        else{
            end = end+1 % size;
        }

        q[end] = x;
        cursize++;
    }

    public void pop(){
        if(cursize == 0) {
            System.out.println("Queue is empty");
            return ;
        }

        if(cursize == 1){
            start = end = -1;
        }

        else {
            start = start + 1 % size;
        }
        cursize--;
    }

    public int top(){
        if(cursize == 0){
            System.out.println("Queue is empty");
            return 0;
        }
        return q[start];
    }

    public int size(){
        return cursize;
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray();
        q.push(10);
        q.push(9);
        q.push(8);
        q.pop();
        System.out.println(q.size());
        System.out.println(q.top());
    }
}
