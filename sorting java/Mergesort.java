import java.util.Scanner;
public class Mergesort {
    public static void mergesort(int arr[],int l, int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
        Merge(arr,l,mid,r);
    
}
public static void Merge(int arr[],int l,int mid,int r){
    int temp[] = new int[r-l+1];
    int left = l;
    int right = mid+1;
    int k = 0;
    while(left<=mid && right<=r){
        if(arr[left]<=arr[right]){
            temp[k] = arr[left];
            left++;
        }
        else{
            temp[k] = arr[right];
            right++;
        }
    k++;
}
while(left<=mid){
    temp[k]= arr[left];
    left++;
    k++;
}
while(right<=r){
    temp[k]= arr[right];
    right++;
    k++;
}
for(int i = 0; i<temp.length; i++){
    arr[i+l] = temp[i];
}
}
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the size of array to be sorted : ");
        int n = sc.nextInt();
        System.out.println("enter the elements for the array : ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergesort(arr, 0,arr.length-1);
        System.out.print("the sorted array is : ");
        for(int i = 0; i<n; i++){
        System.out.print(arr[i]+",");
        }
    }
}

}
