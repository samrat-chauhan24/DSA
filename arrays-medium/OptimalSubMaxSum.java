public class OptimalSubMaxSum {
    static int maxSubArray(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int startOfNums = 0; startOfNums< nums.length; startOfNums++){
            currSum += nums[startOfNums];
            
           maxSum = Math.max(maxSum, currSum);
           if(currSum<0) currSum = 0;
        }
        
        return maxSum;
    }
    public static void main(String[] args) {
    int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
    int maxSubSum = maxSubArray(nums);
    System.out.println(maxSubSum);
}
}
