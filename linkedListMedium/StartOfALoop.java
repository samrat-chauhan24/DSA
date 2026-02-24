package linkedListMedium;
import java.util.HashMap;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val1, ListNode next1){
        this.val = val1;
        ListNode next = null;
    }
    ListNode(int val1){
        this.val = val1;
        ListNode next = null;
    }
}
public class StartOfALoop {
    static ListNode startOfaLoopBF(ListNode head){
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(map.containsKey(temp) && map.get(temp) == temp.val) return temp;
            map.put(temp,temp.val);
            temp = temp.next;
        }
        return null;
    }
    static ListNode startOfLoopOpti(ListNode head){
        ListNode slow = head, fast = head;
        while (fast!=null && fast.next != null) {
            if(slow==fast) break;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast==null || fast.next == null) return null;
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
