package linkedLIstEasy;
// we can't use struct in java there is only class
class Node{
    int data;
    Node next; // this node next means it will store the address or refernce to the next node
    // constructor need to be defined
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1; // for this Node(arr[0], null) should be written every time
    }
    // if you don't want to give the pointer again and again
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class BasicSyntax {
    // coversion of array to a LL
    static Node convertToArr(int arr[]){
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
        int countOfLength = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            countOfLength++;
        }
        return countOfLength;
    }
    // search an ele in LL
    static int isPresentInLL (Node head, int element){
        Node temp = head;
        int indexOfEle  =0 ;
        while (temp!=null) {
            if(temp.data==element){
                return indexOfEle;
            }
            temp = temp.next;
            indexOfEle++;
        }
        return 0;
    }
    // deletion in LL
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Node head  = convertToArr(arr);
        System.out.println(head);// add - linkedLIstEasy.Node@251a69d7
        System.out.println(head.data);// data - 1

        // traversing of ll
        Node temp = head; 
        while (temp!=null) {
            System.out.print(temp.data + " ");// output - 1 2 3 4
            temp = temp.next;
        }
        System.out.println(" ");
        
        // length
        int lengthOfll = lengthOfLL(head);
        System.out.println(lengthOfll);// output - 4

        // search
        System.out.println("at index: " + isPresentInLL(head, 3)); // output - at index: 2


    }
}
