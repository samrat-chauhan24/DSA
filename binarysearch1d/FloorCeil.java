package binarysearch1d;

public class FloorCeil {
    static int[] florCeil(int nums[], int target){
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                res[0] = nums[i];
                res[1] = nums[i];
                return res;
            }
            if(nums[i]<target){
               res[0] = nums[i];
            }
            if(nums[i]>target) {
                res[1] = nums[i];
                break;            
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int nums[] = { 3,4,7,8,10};
        int res[] = florCeil(nums, 1);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
