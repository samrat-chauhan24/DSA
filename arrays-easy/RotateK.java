public class RotateK {
    public static void rotateleft(int arr[],int k){
        int n = arr.length;
        for(int j =0;j<k;j++ ){    
        int temp = arr[0];
        for(int i = 0; i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int n = arr.length;
        rotateleft(arr,3);
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
// public void rotate(int[] nums, int k) {
//     int n = nums.length;
//     k = k % n; // important for large k

//     for (int j = 0; j < k; j++) {
//         int temp = nums[n - 1];   // last element

//         for (int i = n - 1; i > 0; i--) {
//             nums[i] = nums[i - 1];
//         }

//         nums[0] = temp;
//     }
// }
// for rotating from right