public class optimalrot {
    
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if(n<=1 || n>100000) return;
        if(k<0 || k>100000) return;
        //for right rotation
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        //for left rotation
        //reverse(nums,0,k-1);
        //reverse(nums,k,n-1);
        //reverse(nums,0,n-1);
    }

    static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

public static void main(String[] args) {
    int nums[] = {1,2,3,4,5,6,7};
    rotate(nums,3);
    // for(int i = 0; i<nums.length;i++){
    //     System.out.println(nums[i]);
    // }
    for(int i : nums){
        System.out.println(i);
    }
}

}
