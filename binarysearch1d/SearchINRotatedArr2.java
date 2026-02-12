package binarysearch1d;

public class SearchINRotatedArr2 {
    static boolean search(int nums[], int target){
       int l = 0, r = nums.length-1;
       while (l<=r) {
        int mid  = (l+r)/2;
        if (nums[mid]==target) return true;
        if(nums[l]==nums[mid] && nums[mid]== nums[r]){ // duplicates element case handling
            l++; r--; continue;
        }
        if(nums[l]<=nums[mid]){ // if left array is sorted
            if (nums[l]<=target && target < nums[mid]) r = mid-1; // and target id b/w l and mid therefore discard right half
            else l = mid+1;                
        }
        else {
            if (nums[mid]< target && target <= nums[r]) l = mid+1;
            else r = mid - 1;
        }
        
       }
    return false;
    }
}
