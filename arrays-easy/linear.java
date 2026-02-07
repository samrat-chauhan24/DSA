public class linear {
    static int linearS(int arr[],int ele){
        int n = arr.length;
        int pos = -1;
        for(int i =0;i<n;i++){
            if(arr[i]==ele) {
                pos = i;
              
                
        }
        
    }
    return pos;
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int pos = linearS(arr, 5);
        if(pos==-1){
            System.out.println("ele not found");
        }
        else{
        System.out.print("the ele found at : " + pos);
        }
    }
}
