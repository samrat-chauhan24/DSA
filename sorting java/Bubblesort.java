import java.util.Scanner;
public class Bubblesort {
    public static int[] bubsort(int arr[]){
       int n=arr.length;
       for(int i = n-1;i>=1; i--){
        for(int j = 0; j<i; j++){
            if(arr[j]>arr[j+1]){
                swap(arr, j);
            }
        }
       }
       return arr;
    }
    public static void swap(int arr[], int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the size of array: ");
            int n = sc.nextInt();
            System.out.println("enter the elements of array : ");
            int arr[] = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            arr = bubsort(arr);
            for(int i = 0; i<n; i++){
            System.out.print(arr[i]+",");
            }
        }
    }
}

