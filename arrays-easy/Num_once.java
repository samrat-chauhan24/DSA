public class Num_once {
    static int []numonce(int nums[], int arr[]){
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,4,2,3,4,5,6,7,6,6};
        int max= nums[0];
        for(int i =0; i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int arr[] = new int[max+1];
        arr = numonce(nums, arr);
        int value = 0;
        for(int i = 0;i<arr.length;i++){
            // 
            System.out.print(arr[i]+" ");
            if(arr[i]==1){
                 value = i;
            }
        }
        System.out.println(" ");
        System.out.print("this number appears only once : "+value);
        System.out.println(" ");
        // for max frequency
        int mfreq=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>mfreq){
                mfreq = i;
            }
        }
        System.out.println("max freq is : "+mfreq);
    }
}
