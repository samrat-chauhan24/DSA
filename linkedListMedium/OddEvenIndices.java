package linkedListMedium;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = null;
    }
}
public class OddEvenIndices {
    static ListNode oddEvenList(ListNode head){
        ListNode odd = head, even = head.next, evenHead = even;
        while (even!=null && even.next!=null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next; 
        }
        odd.next = evenHead;
        return head;
    }
}
