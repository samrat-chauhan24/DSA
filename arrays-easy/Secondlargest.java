import java.util.Scanner;
public class Secondlargest {
    public static int[] largestele(int arr[]){
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secmax = Integer.MIN_VALUE;
        int secmin = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                secmax = max;
                max=arr[i];//max element
            }
            else if(arr[i] < max && arr[i]>secmax){//arr[i]>secmax means closest number and arr[i]<max means all small number than max
                secmax = arr[i];// second max
            }
            if(arr[i]<min){
                secmin = min;
                min=arr[i];//min element
            }
            else if(arr[i] > min && arr[i] < secmin){
                secmin = arr[i];//second minimum
            }
        }
       return new int[]{min,secmin,max,secmax};
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("enter the size of array: ");
            int n = sc.nextInt();
            
            System.out.println("enter the elements of array:");
            int arr [] = new int[n];
            for(int i = 0; i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans[] = largestele(arr);
            
            System.out.println("the min ele is: "+ ans[0]);
           
            System.out.println("the second min ele is: "+ ans[1]);
            
            System.out.println("the max ele is: "+ ans[2]);
           
            System.out.println("the second max ele is: "+ ans[3]);
        }
    }
}
