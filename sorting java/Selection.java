import java.util.Scanner;
public class Selection{
    public static int[] selectionsort(int arr[]){
       int n = arr.length;
        for(int i =0; i<= n-2;i++){
            int mini = i;
            for(int j = i+1; j<= n-1; j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
        swap(arr, i, mini);
        }
    return arr;
    }
    public static void swap(int arr[], int i, int mini){
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the size of aray n : ");
            int n = sc.nextInt();
            System.out.println("enter the elements of array : ");
            int arr[] = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
   arr  = selectionsort(arr);
   for(int i = 0; i<n; i++){
            System.out.print(arr[i]+ ",");
   }
        }
    }
}

