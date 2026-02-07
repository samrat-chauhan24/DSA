import java.util.Scanner;
public class Insertion {
    public static int[] insort(int arr[]){
        int n= arr.length;
        for(int i =1;i<n; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr, j);
                j--;
            }
        } 

    return arr;
}
public static void swap(int arr[], int j){
    int temp = arr[j];
    arr[j]= arr[j-1];
    arr[j-1] = temp;
}
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the size of array to be sorted : ");
        int n = sc.nextInt();
        System.out.println("enter the elements: ");
        int arr [] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arr = insort(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+",");
        }
    }
        
    
}
}
