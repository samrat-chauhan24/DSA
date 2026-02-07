public class Sortedarray {
    public static boolean isorted(int arr[]){
        int n = arr.length;
        if(n<=1){
            return true;
        }
        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }   
        
    return true;
}
    public static boolean isorted2(int arr[]){
        int n = arr.length;
        if(n<=1){
            return true;
        }
        for(int i = 0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }   
        
    return true;
}
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};

    boolean a = isorted(arr);
    boolean b = isorted2(arr);
    if(a){
        System.out.println("the array is sorted in increasing order");
    }
    else if (b) {
        System.out.println("the array is sorted in decreasing order");       
    }
    else{
        System.out.println("not sorted");
    }
}
}
