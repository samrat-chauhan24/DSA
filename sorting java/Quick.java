import java.util.Scanner;

public class Quick {
    public static void quicksort(int arr[], int l, int r){
        if(l>=r){
            return;
        }
    int loc = Partition(arr, l, r);
    quicksort(arr, l, loc-1);
    quicksort(arr, loc+1, r);

}
 public static int Partition(int arr[], int l, int r){
     int pivot = arr[l];
    int i =l; int j =r;
    while(i<j){
        while(i<=r && arr[i]<=pivot){
            i++;
        }
        while(j>=l && arr[j]>pivot){
            j--;
        }
    if(i<j){
        swap1(arr, i, j);
    }
    }
    swap1(arr, l, j);

    return j;
}
  public static void swap1(int arr[],int i, int j){
    int t1 = arr[i];
    arr[i] = arr[j];
    arr[j] = t1;
    
  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the size of aray n : ");
        int n = sc.nextInt();
        System.out.println("enter the elements of array : ");
        
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
         arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, arr.length-1);
        System.out.println("the sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
    }
}
}