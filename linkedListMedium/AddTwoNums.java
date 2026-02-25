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
public class AddTwoNums {
    static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum = carry;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            // length of lsit doesn't matters, at each iteration create a new node for sum
            carry = sum / 10; // will give the quotient
            sum = sum % 10; // will gvie the last digit
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if(carry == 1) temp.next = new ListNode(carry);
        return dummyNode.next;
    }
}
