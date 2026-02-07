public class Consecutive1 {
    public static int cons1(int nums[]){
        int n = nums.length;
        int count = 0;
        int maxi = 0;
        // if(n<=1) return nums[0];
        for(int i : nums){
            // if(nums[i]!=0 && nums[i]!=1){
            //     System.out.println("invalid value at index: " + i);
            // }
            if(i==1){
                count++;
            }
            else{
                count=0;
            }
            maxi = Math.max(maxi, count);
        }
        System.out.println("length of array is : "+n);
        return maxi;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,1,0,0,1,1,1,0};
        int ans = cons1(nums);
        System.out.println("the streak is : "+ans);
    }
}
