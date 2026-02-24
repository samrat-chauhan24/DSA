package linkedListMedium;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class IsPalindrome {
   static boolean isPalinDromeLL(ListNode head){
    if(head==null||head.next==null) return true;
    ListNode newHead = copyOfList(head);
    ListNode toBeChecked = reverseOfList(newHead);
    ListNode temp = head;
    ListNode temp2 = toBeChecked;
    while (temp!=null) {
        if(temp.val!=temp2.val) return false;
        temp = temp.next;
        temp2 = temp2.next;
    }
    return true;
   }
   // copying a LL to compare with a reverse of it
   static ListNode copyOfList(ListNode head){
    if(head==null) return null;
    ListNode newHead = new ListNode(head.val); // first ele copy
    ListNode temp = head.next; // to track if og is null
    ListNode newTemp = newHead; 
   
    while (temp!=null) {
        newTemp.next = new ListNode(temp.val);
        newTemp = newTemp.next;
        temp = temp.next;
    }
    return newHead;
   }

   // reverse of a LL
   static ListNode reverseOfList(ListNode head){
    ListNode curr = head;
    ListNode prev = null;
    while(curr!=null){
        ListNode nextOrCurr = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextOrCurr;
    }
    return prev;
   }
   // optimal solution
   static boolean isPalindromeLL(ListNode head){
        if(head==null||head.next==null) return true;
        ListNode slow = head, fast = head;
        // to find the middle of the LL
        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null) slow = slow.next; // for odd length in case of odd it will skip middle
        ListNode newHead = slow; // reverse the ll from middle
        ListNode curr = newHead;
        ListNode prev = null;
        while(curr!=null){
            ListNode nextOfCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextOfCurr; 
        }
        // prev denotes the reversed head
        ListNode temp2 = prev;
        ListNode temp = head;
        while (temp2!=null) {
            if(temp.val!=temp2.val) return false;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return true;
   }
}
