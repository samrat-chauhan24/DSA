package StackQueueImp;
    // most used functions are:
    // push, pop, top, size
    // implementing stack using array    
class  StackImp{
    
    int top = -1;
    int stack[] = new int[10];
    
    void push(int x){
        if(top == stack.length - 1) {
            System.out.println("size of stack exceeded");
            return;
        }
        stack[++top] = x;
    }
    int top(){
        if(top == -1) return -1;
        return stack[top];
    }
    void pop(){
        if(top == -1) {
            System.out.println("not ele to delete");
            return;
        }
        top = top - 1;
    }
    int size(){
        return top + 1;
    }
}

public class StackBasics {
    public static void main(String[] args) {
        StackImp stack = new StackImp();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
        StackLinkList listStack = new StackLinkList();
        System.out.println("------------------LINKED LIST STACK----------------------" );
        listStack.push(10);
        listStack.push(100);
        listStack.push(1000);
        listStack.push(10000);
        System.out.println(listStack.size());
        System.out.println("before pop : "+ listStack.top());
        listStack.pop();
        System.out.println("after pop top becomes : " + listStack.top());
        listStack.pop();
        listStack.pop();
        listStack.pop();
        listStack.pop(); // here the stack becomes empty
        System.out.println(listStack.top());// now it will return -1
    }
}
// now implementing using LL
class StackLinkList{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    ListNode top; int curSize = 0;
   
    void push(int x){
        ListNode newPushedVal = new ListNode(x);
        newPushedVal.next = top;
        top = newPushedVal;
        curSize++;
    }

    int top(){
        if(top == null) return -1;
        return top.val; 
    }
    void pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        ListNode temp = top;
        top = top.next; // which is null
        temp.next = null;
        curSize--;
    }
    int size(){
        return curSize;
    }
}
