package StackQueueImp;
import java.util.*;
class MyStack{
    Queue<Integer> myStack;
    
    public MyStack() {
        myStack = new ArrayDeque<>();
    }
    
    public void push(int x){
        // whenever we push an ele, the queue should be reversed
        int sizeOfMyStack = myStack.size();
        myStack.add(x);
        for(int i = 1; i <= sizeOfMyStack; i++){
            myStack.add(myStack.peek());
            myStack.remove();
        }
    }
    
    public int pop(){
        return myStack.remove();
    }
    
    public int top(){
        return myStack.peek();
    }

    public boolean empty(){
        if(myStack.peek() == null) return true;
        else return false;
    }
}

