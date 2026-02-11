package binarysearch1d;

public class BinarySearchRec {
    static int search(int nums[], int target){
        return binarySearch(nums, 0, nums.length-1, target);
    }
    static int binarySearch(int nums[], int l, int r, int target){
        if(l>r) return -1;
        int mid = (l+r)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target){
            return binarySearch(nums, mid+1, r, target);
        }
        else {return binarySearch(nums, l, mid-1, target);}
    }
    public static void main(String[] args) {
        int nums[] = {5};
        int ans = search(nums, 5);
        System.out.println(ans);
    }
}
