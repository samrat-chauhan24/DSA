package linkedLIstEasy;
class Node{
    int data;
    Node next;
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
}
public class InsertionInLL {
    // conversion to array
    static Node convert2Array(int arr[]){
        if(arr.length==0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;            
        }
        return head;
    }
    // length of LL
    static int lengthOfLL(Node head){
        int lenOfLL = 0;
        Node temp = head;
        while (temp != null) {
            lenOfLL++;
            temp = temp.next;
        }
        return lenOfLL;
    }

    // insertion at head - replacing the first value: it's wrong
    static Node insertionAtHead(Node head, int valueToBeInserted){
        // head.data = valueToBeInserted;
        // return head;
        Node newHead = new Node(valueToBeInserted);
        newHead.next = head;
        return newHead;// return new Node(valueToBeInsterted, head)
    }

    // insertion at tail
    static Node insertionTail(Node head, int valueToBeInserted){
        Node newTail = new Node(valueToBeInserted);
        if(head==null) return newTail;
        
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }

        temp.next = newTail;
        return head;
    }

    // insertion at kth element
    static Node insertiionPos(Node head, int lenOfLL, int valueToBeinserted, int pos){
        if(pos<=0 || pos > lenOfLL + 1) return head;
        
        else if(head==null) return new Node(valueToBeinserted);
        
        else if(pos==1) return new Node(valueToBeinserted,head);       
        else{
            Node temp = head;
            int countOfInsertion = 1;
            while (temp!=null) {
                if(countOfInsertion==pos-1){
                    Node newNode = new Node(valueToBeinserted);
                    
                    Node nextOfTemp = temp.next;// either this
                    temp.next = newNode;// or - newNode.next = temp.next; 
                    newNode.next = nextOfTemp;//temp.next = newNode;  
                    break;                  
                }
                countOfInsertion++;
                temp = temp.next;
            }
        }
        return head;
    }
    // insertion before some element
    static Node insertiionBeforeValue(Node head, int valueToBeinserted, int value){
        boolean found = false;
        if(head.data==value) return new Node(valueToBeinserted,head);       
        else{
            Node temp = head;
            
            //Node prev = null;
            while (temp.next!=null) {
                if(temp.next.data == value){
                    Node newNode = new Node(valueToBeinserted);
                    newNode.next = temp.next;
                    temp.next = newNode;
                    found = true;                        
                    break;                          
                }
                //prev = temp;
                temp = temp.next;
            }
        }
        if(!found){
            System.out.println("the value is not found in linkedList, please recheck the value");
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {24,9,3,25,6,5};
        Node head = convert2Array(arr);
        
        System.out.println("insertion at head");
        Node insertAtHead = insertionAtHead(head, 23);
        Node temp = insertAtHead;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        // insertion at tail
        System.out.println("insertion at tail");
        Node tailHead = insertionTail(head, 23);      
        Node temp2 = tailHead;
        while (temp2!=null) {
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }  
        int lenOfLL = lengthOfLL(head);
        System.out.println("the length of LL is: " + lenOfLL);

        // insertion at kth element or pos
        System.out.println("insert at kth");
        Node newNodeInBetween = insertiionPos(tailHead, lenOfLL, 222, 7);
        Node temp3 = newNodeInBetween;
        while (temp3!=null) {
            System.out.println(temp3.data);
            temp3 = temp3.next;
        }
        int lenOfLL2 = lengthOfLL(newNodeInBetween);
        System.out.println("the length of LL is: " + lenOfLL2);
        
        // insertion before some element
        System.out.println("insertion before values");
        Node inBetweenInsert = insertiionBeforeValue(newNodeInBetween,111 , 7);
        Node temp4 = inBetweenInsert;
        while (temp4!=null) {
            System.out.println(temp4.data);
            temp4 = temp4.next;
        }
    }
}
