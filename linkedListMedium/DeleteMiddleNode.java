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
public class DeleteMiddleNode {
    static ListNode deleteMiddle(ListNode head){
        if(head==null || head.next==null) return null;
        ListNode beforeHead = new ListNode(0,head);
        ListNode slow = beforeHead, fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return beforeHead.next;
    }
}
