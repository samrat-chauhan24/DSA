package binarysearch1d;

public class LowerBound {
    static int lowerBound(int nums[], int key){
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>=key){// for upper bound remove equality.
                return i;
            }
        }
    return nums.length;
    }
    public static void main(String[] args) {
        int nums[] = {3,5,8,15,19};
        int ans = lowerBound(nums, 9);
        System.out.println(ans);
    }
}
