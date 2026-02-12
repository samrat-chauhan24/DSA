package binarysearch1d;

public class SingleElement {
    static int usingxor(int nums[]){
        int xorr = 0;
        for(int i : nums){
            xorr ^= i;
        }
        return xorr;
    }
    static int usingBS(int nums[]){
        if(nums.length == 1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        int l = 1, r = nums.length-2;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            if((mid%2==0 && nums[mid]==nums[mid+1])|| (mid%2 !=0 && nums[mid]==nums[mid-1])) l = mid + 1;
            else r = mid - 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3,4,5,5,6,6};
        int ans1 = usingBS(nums);
        int ans2 = usingxor(nums);
        System.out.println(ans1  + " " + ans2);
    }
}
