package binarysearch1d;
public class SearchInRotatedArray {
    static int search(int nums[], int target){
        int l = 0, r = nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            if(nums[l]<=nums[mid]){ // if l < mid its mean it is sorted
                if(nums[l]<=target && target < nums[mid]) // is target b/w l and mid
                    r = mid-1;
                else 
                    l = mid+1;
            }
            else{
                if(nums[mid] < target && target <= nums[r]) 
                    l = mid+1;
                else 
                    r = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,6,7,0,1,2};
        int ans = search(nums, 0);
        System.out.println(ans);
    }
}
