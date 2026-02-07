public class Longestsubarray{
    static int longsub (int arr[], int givsum){
        int len = 0, maxlen = 0;
         
        for(int i = 0;i< arr.length; i++){
            int sum = 0;
            for(int j = i; j <arr.length; j++){
                sum += arr[j];
                if(sum==givsum){
                    len = j-i+1;
                }
                maxlen = Math.max(maxlen, len);
            }
        }              
    return maxlen;
}
public static void main(String[] args) {
    int arr[] = {-3,2,1};
    
    int maxlen = longsub(arr, 15);
    System.out.println("maxlen of subarray is: "+maxlen);

}
}