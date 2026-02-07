public class Move0 {
    static int[] movezeros(int arr[] ){
        int n = arr.length;
        int brr[] = new int[n];
        int k = 0;
        for(int i = 0;i<n; i++){
            if(arr[i]!=0){
                brr[k] = arr[i];
                k++;
            }
            
        
        }
        return brr;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,0,0,3,2,4,3};
        int brr[] = movezeros(arr);
        movezeroes(arr);
        System.out.println("output of in place");
        for(int i :arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("output of copy array");
        for(int i : brr){
            System.out.print(i+" ");
        }
    }
    static void movezeroes(int arr[]){
        int n = arr.length;
        int k = 0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                arr[k] = arr[i];
                k++;
            }
        }
        while(k<n){
            arr[k] = 0;
            k++;
        }

    }
}
