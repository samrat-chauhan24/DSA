public class RemoveDups {
   public static int remdups(int arr[], int brr[]){
    int k = 0;
    brr[k]=arr[0];
    k++;
    for(int i = 1; i<arr.length;i++){
        if(arr[i]!=arr[i-1]){
            brr[k]=arr[i];
            k++;
        }
    }
    return k;
   }
   public static void main(String[] args) {
    int arr[] = {2,2,2,3,3,4,4,5,5};
    int brr[] = new int[arr.length];
    int size = remdups(arr, brr);
    // int res [] = new int[size];
    for(int i = 0; i<size;i++){
        System.out.println(brr[i]);
    }
   }
   
}

