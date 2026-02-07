public class Missingnum {
    static int missing(int nums[]){
        int sumarr = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]<0||nums[i]>nums.length) return 0;
        }
        for(int i = 0;i<nums.length;i++){
            sumarr = nums[i] + sumarr; 
        }       
        int sum = sumofN(nums.length,0);
        return (sum-sumarr);
    }
    static int sumofN(int n,int sum){
        
        if(n==0){
            return sum;
        }
        return sumofN(n-1, sum = sum + n);
        
    }
    public static void main(String[] args) {
        int nums [] = {0};
        int ans = missing(nums);
        System.out.println("the missing element is  : "+ans);
    }
}
