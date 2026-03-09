package StackQueueImp;

// using arrays
class QueueImp{
    int queue[] = new int[10];
    int start = -1, end = -1;
    int curSize = 0;
    void push(int x){
        if(curSize < queue.length){
            if(start == -1 && end == -1){
            start = 0; end = 0;
            queue[start] = x;
        }
            else{
                end++;
                // circular queue to reuse empty space
                if(end == queue.length) end = 0;
                queue[end] = x;
            }
            curSize++;
        }
        else{
            System.out.println("Queue OverFlow");
            return;
        }
    }

    void pop(){
        if(curSize == 0){
            System.out.println("Queue is empty");
            return;
        }
        if(curSize == 1){
            start = -1;
            end = -1;
        }
        else{
            start++;
            if(start == queue.length) start = 0;
        }
        curSize -= 1;
    }
    
    int top(){
        if(start == -1) return -1;
        return queue[start];
    }
    
    int size(){
        return curSize;
    }
}

public class QueueBasics {
    public static void main(String[] args) {
        QueueImp queue = new QueueImp();
        queue.push(10);
        queue.push(100);
        queue.push(1000);
        queue.push(10000);
        queue.push(100000);
        System.out.println(queue.size());
        //System.out.println(queue.top());
        queue.pop();
        System.out.println(queue.top());
        System.out.println("----------------LINK LIST QUEUE---------------");
        QueueLinkList listQueue = new QueueLinkList();
        listQueue.push(10);
        listQueue.push(100);
        listQueue.push(1000);
        listQueue.push(10000);
        System.out.println(listQueue.size());
        System.out.println("before pop : "+ listQueue.top());
        listQueue.pop();
        System.out.println("after pop top becomes : " + listQueue.top());
        listQueue.pop();
        listQueue.pop();
        listQueue.pop();
        listQueue.pop(); // here the Queue becomes empty
        System.out.println(listQueue.top());// -1 will be returned here
    }
}
// now using LL
class QueueLinkList{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    ListNode start;
    ListNode end;
    int currentSize = 0;
    void push(int x){
        ListNode newPushedVal = new ListNode(x);
        if(currentSize == 0){
            start = newPushedVal;
            end = newPushedVal;
            
        }
        else{
            end.next = newPushedVal;
            end = newPushedVal;
        }
        currentSize++;
    }
    void pop(){
        if(currentSize == 0) {
            System.out.println("queue is empty");
            return;
        }
        start = start.next;
        currentSize--;
        if(currentSize == 0){
            end = null;
        }
    }
    int top(){
        if(currentSize == 0) return -1;
        return start.val;
    }
    int size(){
        return currentSize;
    }
}