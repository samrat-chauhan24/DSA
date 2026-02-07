public class Sort012 {

    static int c0 = 0;
    static int c1 = 0;
    static int c2 = 0;
    
    static void sort012(int []arr){
        
        for(int i:arr){
            if(i==0) c0++;
            else if(i==1) c1++;
            else if(i==2) c2++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sort012(arr);
        
        
        int k = 0;
        for(int i = 0;i<c0; i++){
            arr[k++] = 0;
        }
         for(int i = 0 ;i<c1; i++){
            arr[k++] = 1;
        }
         for(int i = 0;i<c2; i++){
            arr[k++] = 2;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }


       
    }
}
