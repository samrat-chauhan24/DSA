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
public class OddEvenValueLL {
    static ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode ohead = null, otail = null;
        ListNode ehead = null, etail = null;
        ListNode temp = head;
        while (temp!=null) {
            if(temp.val%2==0){
                if(ehead==null){
                    ehead = temp;
                    etail = temp;
                }
                else{
                    etail.next = temp;
                    etail = temp;
                }
            }
            else{
                if(ohead == null){
                    ohead = temp;
                    otail = temp;
                }
                else{
                    otail.next = temp;
                    otail = temp;
                }
            }
            temp = temp.next;
        }
        if(ehead == null) return ohead;
        if(ohead == null) return ehead;
        etail.next = ohead;
        otail.next = null;
        return ehead;
    }
}
