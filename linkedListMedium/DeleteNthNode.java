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
public class DeleteNthNode {
    static int lenofLL (ListNode head){
        int lenLL = 0;
        ListNode temp = head;
        while (temp!=null) {
            lenLL++;
            temp = temp.next;
        }
        return lenLL;
    }
    static ListNode deleteFromEnd(ListNode head, int n){
        if(head == null) return null;
        int lenOfLL = lenofLL(head);
        int lenFromEnd = lenOfLL - n + 1;
        if(lenFromEnd == 1){
            head = head.next;
        }
        else{
            int countToDelete = 1;
            ListNode temp = head;
            while (temp!=null) {
                if(countToDelete == lenFromEnd - 1){
                    temp.next = temp.next.next;
                }
                countToDelete++;
                temp = temp.next;
            }
        }
        return head;
    }
    // another most optimal version
    static ListNode deleteFromEnds(ListNode head, int n){
        ListNode beforeHead = new ListNode(0,head);
        ListNode slow = beforeHead, fast = beforeHead;
        for(int i = 0; i<=n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        // when fast = null, slow will point on the node before the nodeToBedeleted(n)
        slow.next = slow.next.next;
        return beforeHead.next;
    }
}
