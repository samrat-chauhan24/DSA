package linkedLIstEasy;
class node{
    int data;
    node next;
    node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class DeletionInLL {
    // conversion of array in LL
    static node conversionToArr(int arr[]){
        node head = new node(arr[0]);
        node mover = head;
        for(int i = 1; i<arr.length; i++){
            node temp = new node(arr[i]);
            mover.next = temp; // storing address of temp in mover
            mover = temp; // updating the mover to the address of the element at temp
        }
        return head;
    }
    // deletion in the LL at head
    static node deletionHead(node head){
        if(head==null) return head;
        return head = head.next;
        // in java no need to manually delelte the old reference of head because the garbage colllection takes care of it, we have to just move the head to next;
    }
    
    // deletion at the tail of LL
    static node deletionTail(node head){
        if(head == null || head.next == null) return null;
        node temp = head;
        // if temp.next.next == null, it means that it is the second last element
        while(temp!=null){
            if(temp.next.next == null) temp.next = null;
            temp = temp.next;
        }
        return head;
    }
    // length of LL
    static int lenghtOfLL(node head){
        int lenOfLL = 0;
        node temp = head;
        while (temp!=null) {
            temp = temp.next;
            lenOfLL++;
        }
        return lenOfLL;
    }
    
    // delete the kth position element
    static node deletionPos(node head, int lenOfLL, int k){
        if(head==null) return head;
        else if (k<=0 || k > lenOfLL) return head;
        else if(k==1) return head = head.next; // if k is the first element
        
        else if(lenOfLL == k){ // if k is the last element
            node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
        // if the pos is in the middle of head and tail
        else {
            int count = 0;
            node temp = head;
            while (temp!=null) {
                count++;
                if(count==k-1){
                    temp.next = temp.next.next;
                    return head;
                }
                temp = temp.next;
            }
        }
        return head;
    }    
    
    
    public static void main(String[] args) {
        int arr[] = {24, 9, 5, 6, 25};
        node head = conversionToArr(arr);
        System.out.println(head.data); // 24
        
        // after deletion of head
        System.out.println("deletion of head output");
        node newHead = deletionHead(head);
        node temp = newHead;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        
        // deletion at tail
        System.out.println("deleltion at tail");
        node tailHead = deletionTail(head);
        node temp1 = tailHead;
        while (temp1!=null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }

        System.out.println("after deleted output");
        node head1 = conversionToArr(arr);
        int lenofLL = lenghtOfLL(head1);
        node finalHead = deletionPos(head1, lenofLL,6);
        node finalTemp = finalHead;
        while (finalTemp!=null) {
            System.out.println(finalTemp.data);
            finalTemp = finalTemp.next;
        }            
    }
}
