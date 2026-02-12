package binarysearch1d;

public class MinRotatedSortedArr {
    static int findMin(int nums[]){
        int min = Integer.MAX_VALUE;
        int l = 0, r = nums.length-1;
        while (l<=r) {
            int mid = l + (r-l)/2;
            if (nums[mid]<min) {
                min = nums[mid];
            }
            if (nums[l]<= nums[mid]) {
                if (nums[l] <= min && min < nums[mid]) r = mid-1;
                else l = mid + 1;
            }
            else{
                if(nums[mid] < min && min <= nums[r]) l = mid + 1;
                else r = mid - 1; 
            }
        }
        return min; 
    }
    static int findMin2(int[] nums) {
        int l =0, r = nums.length-1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[mid]>nums[r]) l =mid+1;
            else r = mid;
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2,3};
        int min = findMin2(nums);
        System.out.println(min);
    }
}
