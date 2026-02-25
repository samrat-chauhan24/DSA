package linkedListMedium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val1, ListNode next1){
        this.val = val1;
        this.next = null;
    }
    ListNode(int val1){
        this.val = val1;
        this.next = null;
    }
}
public class SortLL {
    static ListNode sortList(ListNode head){
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        for(int i = 0; i< list.size();i++){
            temp.val = list.get(i);
            temp = temp.next;
        }
        return head;
    }
    // faster version for this using merge sort
    static ListNode findMiddle(ListNode head){
        ListNode slow = head, fast = head;
        while(fast.next!=null/* for odd */ && fast.next.next!=null/* for even */){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static ListNode mergeList(ListNode leftList, ListNode rightList){
        ListNode afterMergeHead = new ListNode(-1);
        ListNode temp = afterMergeHead;
        while(leftList!=null && rightList!=null){
            if(leftList.val < rightList.val){
                temp.next = leftList;
                temp = leftList;
                leftList = leftList.next;
            }
            else{
                temp.next = rightList;
                temp = rightList;
                rightList = rightList.next;
            }
        }
        if(leftList != null) temp.next = leftList;
        else temp.next = rightList;
        return afterMergeHead.next;// to skip -1
    }
    static ListNode mergeSortLL(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode mid = findMiddle(head);
        ListNode leftList = head;
        ListNode rightList = mid.next;
        mid.next = null;
        leftList = mergeSortLL(leftList);
        rightList = mergeSortLL(rightList);
        return mergeList(leftList, rightList);        
    }
}
