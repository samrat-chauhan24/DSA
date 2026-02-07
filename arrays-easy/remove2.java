public class remove2 {
    public static int remdups(int arr[]){
        int k = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,2,3,3,4,4,5,5};
        int k = remdups(arr);
        // int res[] = new int[k];
        for(int i = 0; i< k;i++){
            System.out.println(arr[i]);
        }
    }
}

