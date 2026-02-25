package linkedListMedium;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = null;
    }
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
// this is also optimal
public class IntersectionLL {
    static ListNode findIntersection(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        int lenOfA = lengthOfLL(headA);
        int lenOfB = lengthOfLL(headB);
        ListNode temp1 = headA, temp2 = headB;
        if(lenOfA > lenOfB){
            for(int i = 0; i < lenOfA - lenOfB; i++){
                temp1 = temp1.next;
            }
            while(temp1!=null && temp2!=null){
                if(temp1==temp2) {
                    return temp1;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        else{
            for(int i = 0; i < lenOfB - lenOfA; i++){
                temp2 = temp2.next;
            }
            while(temp1!=null && temp2!=null){
                if(temp1==temp2) {
                    return temp1;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return null;
    }
    static int lengthOfLL(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
    // two pointer switching solution - optimal
    static ListNode getIntersection(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        ListNode temp1 = headA, temp2 = headB;
        while(temp1!=temp2){
            if(temp1==null) temp1 = headA;
            else temp1 = temp1.next;
            if(temp2 == null) temp2 = headB;
            else temp2 = temp2.next;
            // other syntax
            temp1 = (temp1 == null) ? headB : temp1.next;
            temp2 = (temp2 == null) ? headA : temp2.next;
        }
        return temp2;
    }
}
