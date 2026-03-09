package StackQueueImp;
import java.util.*;

class MyQueue{
    Stack<Integer> inStack;
    Stack<Integer> outStack;    
    
    public MyQueue(){
        inStack = new Stack<>();
        outStack  = new Stack<>();
    }
    // this push approach takes much more time than, pop and peek opns -> O(2n)
    public void push(int x){
        // if there any ele, move it from in to out
        int inSize = inStack.size();
        if(!inStack.isEmpty()){
            for(int i = 1; i <= inSize; i++){
                outStack.push(inStack.pop());
            }
        }
        // then add x in inStack
        inStack.add(x);
        
        int outSize = outStack.size();
        // if any ele is there, then put every ele from out to in
        if(!outStack.isEmpty()){
            for(int i = 1; i <= outSize; i++){
                inStack.push(outStack.pop());
            }
        }
    }

    public int pop(){
        return inStack.pop();
    }

    public int peek(){
        return inStack.peek();
    }

    public boolean empty(){
        return inStack.isEmpty();
    }
}
// basic idea in this appraoch is, the no of pop and peek are much lesser than push opns, therfore we'll make the pop and peek costly to optimizd the push opns
class MyQueueOpti{
    Stack<Integer> inStack;
    Stack<Integer> outStack;    
    
    public MyQueueOpti(){
        inStack = new Stack<>();
        outStack  = new Stack<>();
    }

    public void push(int x){
        inStack.add(x);
    }

    public int pop(){
        if(!outStack.isEmpty()) return outStack.pop();
        
        while(!inStack.isEmpty()){
            outStack.add(inStack.pop());
        }
        return outStack.pop();       
    }

    public int peek(){
        if(!outStack.isEmpty()) return outStack.peek();
        
        while(!inStack.isEmpty()){
            outStack.add(inStack.pop());
        }
        return outStack.peek();
        
    }

    public boolean empty(){
       return inStack.isEmpty() && outStack.isEmpty();
    }
}