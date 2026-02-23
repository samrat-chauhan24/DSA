package linkedLIstEasy;

import java.util.Stack;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val){ 
        this.val = val;
    }
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next;
    }
}
public class ReverseLL {
    static ListNode reverseListOpti(ListNode head){
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode!=null){
            ListNode nextOfCurrNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextOfCurrNode;
        }
        return head;
    }
    static ListNode reverseListBF(ListNode head){
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp!=null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null) {
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }
    static ListNode conversionToArr(int arr[]){
        if(arr.length==0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i  =0; i<arr.length; i++){
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
