package binarysearch1d;

public class FirstLast {
    static int[] lastocc(int nums[], int target){
        int res[] = new int[2];
        res[0] = -1; res[1] = -1;
        int l = 0, r = nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(target == nums[mid]){
                res[0] = mid;
                r = mid-1;
            }
            else if(nums[mid]>target){
                r = mid-1;
            }
            else l = mid+1;

        }
        l =0; r = nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(target == nums[mid]){
                res[1] = mid;
                l = mid+1;
            }
            else if(nums[mid]>target){
                r = mid-1;
            }
            else l = mid+1;

        }
        return res;
    }      
    public static void main(String[] args) {
        int nums[] = {3,4,13,13,13,20,40};
        int res[] = lastocc(nums, 13);
        System.out.println(res[0]+ " "+ res[1]);
    }  
}
