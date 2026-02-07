public class Rotate {
    public static void rotateleft(int arr[]){
        int n = arr.length;
        int k = arr[0];
        for(int i = 0; i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = k;
        
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int n = arr.length;
        rotateleft(arr);
        System.out.println("rotated array is : ");
        for(int i =0;i<n;i++){
            if(i==n-1){
                System.out.println(arr[i]);//no cooma after last element
            }
            else{
        System.out.print(arr[i]+",");
        }
    }
    } 
}
