public class union {
    static int [] merge(int arr[],int brr[]){
        int n = arr.length; 
        int m = brr.length;
        
        int c[] = new int[n+m];
        
        int i=0; int j=0; int k=0;
        while(i<n && j<m){
            if(arr[i]<=brr[j]){
                c[k] = arr[i];
                k++; i++;
            }
            else{
                c[k] = brr[j];
                k++; j++;
            }
        }
        while(i<n){
            c[k] = arr[i];
            k++; i++;
        }
         while(j<m){
            c[k] = brr[j];
            k++; j++;
        }
   
    return c;
    }
    static int remdups(int c[]){
        int k = 1;
        for(int i = 1; i<c.length;i++){
            if(c[i]!=c[i-1]){
                c[k] = c[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,6,6,7};
        int brr[] = {2,2,2,4,4,4,5,5,6,6,8,8,8,9,9};
        int c [] = merge(arr, brr);
        int k = remdups(c);
        for(int i =0; i<k;i++){
            System.out.println(c[i]+" ");
        }
        
    }
}
