public class MaxSubArrSum {
    static int maxSubArray(int nums[]){
        int maxSubSum = Integer.MIN_VALUE;
        for(int startIdx = 0; startIdx<nums.length; startIdx++){
            int subsum = 0;
            for(int start2Idx = startIdx; start2Idx<nums.length; start2Idx++){
                subsum += nums[start2Idx];
                maxSubSum = Math.max(maxSubSum, subsum);
            }
            
        }
        return maxSubSum;
    }
public static void main(String[] args) {
    int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
    int maxSubSum = maxSubArray(nums);
    System.out.println(maxSubSum);
}
}
