package StackAndQueue;
public class StackUsingArray {

    int s[] = new int[5];
    int top = -1;

    public  void push(int x){

        if(top > 4){
            System.out.println("Stack is filled");
            return ;
        }
        top++;
        s[top] = x;
    }

    public  void pop(){
        if(top == -1) {
            System.out.println("Stack is empty");
            return ;
        }
        top--;
    }

    public  int  size(){
        if(top == -1) {
            System.out.println("Stack is empty");
            return 0 ;
        }
        return top+1;
    }

    public  int  top(){
        if(top == -1) {
            System.out.println("Stack is empty");
            return 0 ;
        }

        return s[top];
    }
    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(1);
        s.push(2);
        s.pop();
        s.push(3);
        System.out.println(s.top());
        System.out.println(s.size());

    }
}
