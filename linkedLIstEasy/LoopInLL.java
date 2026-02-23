package linkedLIstEasy;

import java.util.HashMap;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data1){
        this.data = data1;
        this.next = null;
    }
    ListNode(int data1,ListNode next1){
        this.data = data1;
        this.next = next1;
    }
}
public class LoopInLL {
    static boolean hasCycleOpti(ListNode head){
        ListNode slowTemp = head;
        ListNode fastTemp = head;
        while(fastTemp!=null && fastTemp.next!=null){
            slowTemp = slowTemp.next;
            fastTemp = fastTemp.next.next;
            if(slowTemp == fastTemp) return true; 
        }  
        return false;
    }
    static boolean hasCycleBF(ListNode head){
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while (temp!=null) {
            if(map.containsKey(temp)) return true;
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
}
