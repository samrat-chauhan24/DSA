public class Majorityelement {
    static int[] majorele(int nums[],int arr[]){
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]+=1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int max = 0;
        for(int i : nums){
            if(i>max){
                max = i;
            }
        }
// size of count array        
        int arr[] = new int[max+1];
        arr = majorele(nums, arr);
        System.out.println("nums length/2 is : " + nums.length/2);
        
// printing the element
        for(int i  = 0; i<arr.length; i++){
            if(arr[i]>nums.length/2){
                System.out.println("majority ele is : " + i);
            }          
        }  
    }
}
