package linkedLIstEasy;
class node{
    int data;
    node next;
    node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class DeletionByValue {
    // conversion of array in LL
    static node conversionToArr(int arr[]){
        if(arr.length==0) return null;
        node head = new node(arr[0]);
        node mover = head;
        for(int i = 1; i<arr.length; i++){
            node temp = new node(arr[i]);
            mover.next = temp; // storing address of temp in mover
            mover = temp; // updating the mover to the address of the element at temp
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
    // deletion with values
    static node deletionPos(node head, int lenOfLL, int value){
        if(head == null) return head;
        else if(head.data == value) return head = head.next; // if k is the first element
        else{   
            node temp = head;
            node prev = null;
            while(temp != null){
                if(temp.data == value){
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        return head;         
    }    
}

    public static void main(String[] args) {
        int arr[] = {};
        node head = conversionToArr(arr);
        int lenOfLL = lenghtOfLL(head);
        node delHead = deletionPos(head, lenOfLL, 0);
        node temp = delHead;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
